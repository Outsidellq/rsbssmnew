package com.controller;
import com.entity.Tbuser;
import com.service.TbuserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Tbuser)表控制层
 *
 * @author makejava
 * @since 2020-05-15 08:55:54
 */
@Controller
public class TbuserController {
    /**
     * 服务对象
     */
    @Resource
    private TbuserService tbuserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Tbuser selectOne(Object id) {
        return this.tbuserService.queryById(id);
    }


    @PostMapping(value = "/loginname",produces = "text/html;charset=UTF-8")
    public String login(String username, String password, Model model) {
        System.out.println(username+password);
        if(tbuserService.login(username,password)!=null){
            Tbuser tbuser=tbuserService.login(username,password);
            model.addAttribute(tbuser);
            return "WEB-INF/jsp/index";
        }
        return "login";
    }


}