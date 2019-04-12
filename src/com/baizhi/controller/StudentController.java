package com.baizhi.controller;

import com.baizhi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("select")
    public String select(ModelMap modelMap) {
        List list = studentService.select();
        modelMap.addAttribute("list", list);
        return "forward:index.jsp";
    }

}
