package com.liyuan.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liyuan.common.domain.User;
import com.liyuan.common.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author liyuan
 * @Date 2018/11/17 16:17
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    //这边version要跟服务提供者接口中指定的version要一致
    @Reference(version = "1.0")
    private UserService userService;

    @ApiOperation(value = "测试接口", notes = "测试接口", httpMethod = "POST")
    @RequestMapping("/find")
    public User find(@RequestParam("id") Integer id){
        return userService.find(id);
    }
}
