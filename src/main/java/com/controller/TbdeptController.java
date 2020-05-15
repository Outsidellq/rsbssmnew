package com.controller;
import com.entity.Tbdept;
import com.entity.Tbdocument;
import com.entity.Tbemployee;
import com.entity.Tbstaff;
import com.github.pagehelper.PageHelper;
import com.service.TbdeptService;
import com.service.TbdocumentService;
import com.service.TbemployeeService;
import com.service.TbstaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TbdeptController {
@Autowired
 private TbdocumentService tbdocumentService;
 @Autowired
private TbdeptService tbdeptService;
 @Autowired
 private TbstaffService tbstaffService;
 @Autowired
 private TbemployeeService tbemployeeService;


 @RequestMapping("/insetdocmore")
 public String insetdocmore(Model model){
  List<Tbdocument> list=new ArrayList<Tbdocument>();
Tbdocument tbdocument=new Tbdocument();
tbdocument.setUid(1);
tbdocument.setDfilename("nihao");
tbdocument.setDtitle("nihoa");
tbdocument.setCreatetime(new Date());
tbdocument.setDid(8);
  Tbdocument tbdocument1=new Tbdocument();
  tbdocument1.setDfilename("nihaoscs");
  tbdocument1.setDtitle("nishdshf");
  tbdocument1.setUid(9);
  tbdocument1.setDid(7);
  tbdocument1.setCreatetime(new Date());
  list.add(tbdocument);
  list.add(tbdocument1);
  System.out.println(list);
  System.out.println("插入了几条"+tbdocumentService.insertmore(list));
  return "select";
 }


 @RequestMapping("/insertmore")
 public String insertmore(Model model){
  List<Tbdept> list= new ArrayList<Tbdept>();
  Tbdept tbdept=new Tbdept();
  tbdept.setDeptname("生活部");
  tbdept.setDeptdesc("管理生活");
  Tbdept tbdept1=new Tbdept();
  tbdept1.setDeptname("会计部");
  tbdept1.setDeptdesc("管理财经");
  list.add(tbdept);
  list.add(tbdept1);
  System.out.println( tbdeptService.insertmore(list));
  return "select";
 }

 @RequestMapping("/deletbyidmore")
 public String deletbyidmore(Model model){
  List<Integer> list=new ArrayList<Integer>();
list.add(7);
list.add(9);
list.add(15);
  System.out.println("删除了几条"+tbdeptService.deleteByIdmore(list));
  return "select";
 }


 @RequestMapping("/select")
 public String selectdept(Model model){
     PageHelper.startPage(1,3);
    List<Tbdept> list= tbdeptService.queryAll();
     System.out.println(list);
     model.addAttribute("list",list);
     System.out.println("nihao");
     return "select";
 }

    @RequestMapping("/select2")
    @ResponseBody
    public Tbdept selectdept2(Model model){
        PageHelper.startPage(1,3);
        List<Tbdept> list= tbdeptService.queryAll();
        System.out.println(list);
        model.addAttribute("list",list);
        System.out.println("nihao");
        return tbdeptService.queryById(1);
    }

 @RequestMapping("/selectemps")
 public String selectstaff(Model model) {
  List<Tbstaff> list = tbstaffService.selectmanyemps();
  for (Tbstaff t : list) {
   System.out.println(t.getStaid() + "-" + t.getStaname());
   for (Tbemployee emp : t.getEmps()) {
    System.out.println("\t" + emp.getEmpname());
   }
  }
  model.addAttribute(list);
  return "select";
 }

 @RequestMapping("/selectempdept")
 public String selectempdept(Model model) {
  List<Tbemployee> list = tbemployeeService.selctdept();
  for (Tbemployee t : list) {
   System.out.println(t.getEmpname()+t.getDeptid()+t.getDept());
  }
  model.addAttribute(list);
  return "select";
 }
}
