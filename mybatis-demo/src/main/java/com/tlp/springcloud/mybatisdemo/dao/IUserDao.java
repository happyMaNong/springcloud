package com.tlp.springcloud.mybatisdemo.dao;

import com.tlp.springcloud.mybatisdemo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author：tlp
 * @crateDate：2019/9/28 15:26
 */
@Repository
public interface IUserDao {

    List<User> getAllUser();

    List<User> findUser(User user);

    boolean updateUser(User user);
}
