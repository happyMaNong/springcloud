package com.tlp.springcloud.mybatisdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.tlp.springcloud.mybatisdemo.dao.IUserDao;
import com.tlp.springcloud.mybatisdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author：tlp
 * @crateDate：2019/9/28 15:34
 */
@RestController
public class DemoController {
    @Autowired
    private IUserDao userDao;

    @GetMapping("/findAll")
    public String getAllUser() {
        List<User> allUser = userDao.getAllUser();
        return JSONObject.toJSONString(allUser);
    }

    @GetMapping("/findUser")
    public String findUser(User user) {
        List<User> userList = userDao.findUser(user);
        return JSONObject.toJSONString(userList);
    }

    @PutMapping("/update")
    public String updateUser(User user) {
        if (user!=null&&user.getGid()!=null) {
            boolean b = userDao.updateUser(user);
            return JSONObject.toJSONString(b);
        }else {
            return "false";
        }
    }
}
