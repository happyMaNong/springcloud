package com.tlp.springcloud.servicefegin.controller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @className: IServiceHi
 * @description:
 * @author: tianlingpeng
 * @create: 2019-09-27 10:37
 */
@FeignClient(value = "service-hi", fallback = HystricHiService.class)
public interface IServiceHi {
    @GetMapping(value = "/hello")
    String sayHi();
}
