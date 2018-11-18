package com.liyuan.common.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author liyuan
 * @Date 2018/11/17 15:54
 **/
@Data
public class User  implements Serializable {
    private Integer id;
    private String name;
}
