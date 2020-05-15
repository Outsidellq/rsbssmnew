package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Tbdocument)实体类
 *
 * @author makejava
 * @since 2020-05-09 11:04:23
 */
@Data
public class Tbdocument implements Serializable {
    private static final long serialVersionUID = -74590157155167416L;
    
    private Integer did;
    
    private String dtitle;
    
    private String dfilename;
    
    private Date createtime;
    
    private Integer uid;

}