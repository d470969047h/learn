package com.daihui.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * 测试mongo和spingmvc上传
 * 470969043@qq.com
 *
 * @author daihui
 * @create 2016-07-21 21:55
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

        if(true==file.isEmpty()){
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
}
