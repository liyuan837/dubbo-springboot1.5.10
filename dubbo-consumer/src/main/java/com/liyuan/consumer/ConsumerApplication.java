package com.liyuan.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName DubboProviderApplication
 * @Description TODO
 * @Author liyuan
 * @Date 2018/11/17 16:04
 **/
@SpringBootApplication
@EnableSwagger2
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
