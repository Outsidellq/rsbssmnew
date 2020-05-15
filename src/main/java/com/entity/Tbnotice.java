package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Tbnotice)实体类
 *
 * @author makejava
 * @since 2020-05-09 11:04:23
 */
@Data
public class Tbnotice implements Serializable {
    private static final long serialVersionUID = -91278954620883029L;
    
    private Integer notid;
    
    private String notuser;
    
    private Date nottime;
    
    private String nottitle;
    
    private String notcontent;

}