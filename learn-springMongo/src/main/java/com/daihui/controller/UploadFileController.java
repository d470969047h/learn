package com.daihui.controller;

import com.mongodb.MongoClient;
import org.apache.commons.io.FileUtils;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;

/**
 * 测试mongo和spingmvc上传
 * 470969043@qq.com
 *
 * @author daihui
 *  2016-07-21 21:55
 */
@Controller
@RequestMapping("/upload")
public class UploadFileController {


    @RequestMapping(value = "/upload")
    public String login(){
        return "test";
    }

    @RequestMapping(value = "/springUpload",method = RequestMethod.POST)
    public String fileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request){

        if(file.isEmpty()){
            return "redirect:/test.jsp";
        }

        System.out.println(file.getName());
        System.out.println(file.getSize());
        System.out.println(file.getContentType());


        String outputFileName = request.getServletContext().getRealPath("/upload")+"/"+file.getOriginalFilename();
        System.out.println(outputFileName);
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(),new File(outputFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "test";
    }


    @RequestMapping(value = "/mongoUpload",method = RequestMethod.POST)
    public String mongoFileUpload(@RequestParam("file") MultipartFile file){
        MongoDbFactory mongoDbFactory=null;
        MongoConverter mongoConverter=null;
        String fileName = file.getOriginalFilename();
        InputStream in = null;
        String buckte ="Images";
        try {
            in = file.getInputStream();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            MongoClient mongoClient=new MongoClient("127.0.0.1:27017");
            mongoDbFactory =new SimpleMongoDbFactory(mongoClient,"spring_data_mongo");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


        GridFsTemplate gridFsTemplate = new GridFsTemplate(mongoDbFactory,mongoConverter,buckte);
        gridFsTemplate.store(in,fileName);
        return "test";
    }
}
