package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Tbemployee)实体类
 *
 * @author makejava
 * @since 2020-05-09 11:04:23
 */
@Data
public class Tbemployee implements Serializable {
    private static final long serialVersionUID = 180665260277774506L;
    
    private Integer empid;
    
    private String empname;
    
    private String emptel;
    
    private String empsex;
    
    private String empemail;
    
    private String empidcard;
    
    private String empaddress;
    
    private Date emptime;
    
    private Integer deptid;
    
    private Integer staid;
    private Tbdept dept;
    private Tbstaff tbstaff;

}