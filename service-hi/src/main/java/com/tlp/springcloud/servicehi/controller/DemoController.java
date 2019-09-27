package com.tlp.springcloud.servicehi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: DemoController
 * @description:
 * @author: tianlingpeng
 * @create: 2019-09-27 10:05
 */
@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "hello springcloud!";
    }
}
