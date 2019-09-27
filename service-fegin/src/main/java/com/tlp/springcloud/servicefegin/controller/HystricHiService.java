package com.tlp.springcloud.servicefegin.controller;

import org.springframework.stereotype.Component;

/**
 * @className: HystricHiService
 * @description:
 * @author: tianlingpeng
 * @create: 2019-09-27 11:02
 */
@Component
public class HystricHiService implements IServiceHi {

    @Override
    public String sayHi() {
        return "调用失败，执行相关操作";
    }
}
