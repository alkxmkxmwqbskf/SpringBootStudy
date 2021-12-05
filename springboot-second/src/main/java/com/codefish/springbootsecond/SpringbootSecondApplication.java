package com.codefish.springbootsecond;

import com.codefish.springbootsecond.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringbootSecondApplication implements CommandLineRunner {

    @Resource
    private UserService userService;

    public static void main(String[] args) {
        ////从容器中国获取对象
        //ConfigurableApplicationContext ctx =  SpringApplication.run(SpringbootSecondApplication.class, args);
        ////从容器中获取你期望的对象;
        //UserService userService = (UserService) ctx.getBean("userService");
        //userService.print("张无忌");

        System.out.println("准备创建容器...");
        SpringApplication.run(SpringbootSecondApplication.class, args);
        System.out.println("容器创建成功...");
    }

    @Override
    public void run(String... args) throws Exception {
        String str = userService.print("wangwu");
        System.out.println(str);
        System.out.println("---------");
        System.out.println(args);
    }
}
