package com.codefish.springbootsecond.service.impl;/**
 * @author codefish
 * @date 2021/12/5
 * @apinote
 */

import com.codefish.springbootsecond.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author: codefish
 * @discription:
 */
//创建对象
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public String print(String name) {
        System.out.println("Hello,"+name);
        return name;
    }
}
