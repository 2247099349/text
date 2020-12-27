package com.springboot.service;

import com.springboot.entity.Dept;

import java.util.List;

public interface DeptService {

    List<Dept> queryAll();

    void del(Integer[] arr);
}
