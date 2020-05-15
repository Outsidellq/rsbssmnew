package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * (Tbstaff)实体类
 *
 * @author makejava
 * @since 2020-05-09 11:04:23
 */
@Data
public class Tbstaff implements Serializable {
    private static final long serialVersionUID = 175395447651005721L;
    
    private Integer staid;
    
    private String staname;
    
    private String stadesc;

    private List<Tbemployee> emps;

}