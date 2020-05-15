package com.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Tbdept)实体类
 *
 * @author makejava
 * @since 2020-05-09 11:04:22
 */
@Data
public class Tbdept implements Serializable {
    private static final long serialVersionUID = -42872070193511779L;
    
    private Integer deptid;
    
    private String deptname;
    
    private String deptdesc;

}