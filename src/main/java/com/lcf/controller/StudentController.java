package com.lcf.controller;

import com.github.pagehelper.PageInfo;
import com.lcf.entity.Student;
import com.lcf.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author BigData - lcf
 * @create 2020-11-10 10:12
 */
@Controller
public class StudentController {
    @Resource
    private StudentService service;
    @RequestMapping("list")
    public String list(Model model,@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "3") Integer pageSize){
        PageInfo<Student> list = service.list(pageNum, pageSize);
        model.addAttribute("info", list);
        return "list";
    }
}
