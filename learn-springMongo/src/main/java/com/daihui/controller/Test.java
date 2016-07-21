package com.daihui.controller;

import com.daihui.entity.TUser;
import com.daihui.entity.TUserExample;
import com.daihui.mapper.TUserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by daihui on 2015-10-07.
 */
@Controller
@RequestMapping(value = "/login")
public class Test {

    @Resource
    private TUserMapper userMapper;

    @RequestMapping(value = "/test")
    public String testLogin(Model model){

        TUserExample userExample=new TUserExample();
        userExample.createCriteria().andIdEqualTo("2");
        List<TUser> userList=userMapper.selectByExample(userExample);
        for(TUser user:userList){
            model.addAttribute("name",user.getName());
        }
        return "test";
    }


}
