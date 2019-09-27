package com.tlp.springcloud.servicefegin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: UserSeviceController
 * @description:
 * @author: tianlingpeng
 * @create: 2019-09-27 10:34
 */
@RestController
public class UserSeviceController {
    @Autowired
    IServiceHi serviceHi;

    @GetMapping("/sayHi")
    public String getSayHello() {
        return serviceHi.sayHi();
    }
}
