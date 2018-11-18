package com.liyuan.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.liyuan.common.domain.User;
import com.liyuan.common.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author liyuan
 * @Date 2018/11/17 15:55
 **/
//这里的@Service是dubbo提供的注解，这里有一些参数：
@Service(version="1.0",application = "${dubbo.application.id}",protocol = "${dubbo.protocol.id}",registry = "${dubbo.registry.id}")
public class UserServiceImpl implements UserService {
    @Override
    public User find(Integer id) {
        System.out.println("sas");
        User user = new User();
        user.setName("李袁");
        user.setId(id);
        return user;
    }
}
