package com.tlp.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: DemoConfig
 * @description:
 * @author: tianlingpeng
 * @create: 2019-09-27 11:28
 */
@RestController
public class DemoConfig {
    @Value("${username}")
    String username;

    @GetMapping("/getUri")
    public String getMongodbUri() {
        return username;
    }
}
