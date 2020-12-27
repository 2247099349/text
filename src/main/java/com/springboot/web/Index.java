package com.springboot.web;

import com.springboot.entity.Dept;
import com.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author liiiiii
 * @ClassName: Index
 * @Date 2020/12/25
 * @Version 1.0
 */
@Controller
public class Index {
    @RequestMapping("workbench/index")
    public String index() {
        return "workbench/index";
    }

   @RequestMapping("workbench/main/index")
    public String index1() {
        return "workbench/main/index";
    }
}
