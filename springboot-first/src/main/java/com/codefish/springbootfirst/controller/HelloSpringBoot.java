package com.codefish.springbootfirst.controller;/**
 * @author codefish
 * @date 2021/12/5
 * @apinote
 */

import com.codefish.springbootfirst.vo.School;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author: codefish
 * @discription:
 */
@Controller
public class HelloSpringBoot {

    @Value("${school.name}")
    private String name;

    @Value("${school.website}")
    private String website;

    @Value("${site}")
    private String site;

    @Resource
    private School school;

    @ResponseBody
    @RequestMapping("/hello")
    public String helloSpringBoot(){
        return name+":"+website+",<br>Site:"+site;
    }

    @ResponseBody
    @RequestMapping("/getInfo")
    public String getInfo(){
        return school.toString();
    }
}
