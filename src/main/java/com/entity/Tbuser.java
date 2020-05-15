package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Tbuser)实体类
 *
 * @author makejava
 * @since 2020-05-09 11:04:23
 */
@Data
public class Tbuser implements Serializable {
    private Object uid;
    
    private String uname;
    
    private String upwd;
    
    private String ustate;
    
    private Date createtime;

}