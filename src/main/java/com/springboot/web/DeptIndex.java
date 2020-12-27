package com.springboot.web;

import com.springboot.entity.Dept;
import com.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author liiiiii
 * @ClassName: DeptIndex
 * @Date 2020/12/25
 * @Version 1.0
 * @noinspection ALL
 */
@Controller
@RequestMapping("/settings")
public class DeptIndex {

@Autowired
    DeptService deptService;

@RequestMapping("/dept/index")
    public void index(Model model){
    List<Dept> depts = deptService.queryAll();
    model.addAttribute("depts",depts);
}

@RequestMapping("/del")
@ResponseBody
    public String del(Integer[] arr){
    if (arr.length == 0){
        return "erroy";
    }
    deptService.del(arr);
    return "success";
}

}
