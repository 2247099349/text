package com.springboot.service;

import com.springboot.entity.Dept;
import com.springboot.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author liiiiii
 * @ClassName: DeptImpl
 * @Date 2020/12/25
 * @Version 1.0
 * @noinspection ALL
 */
@Service
public class DeptImpl implements DeptService{

    @Autowired
    DeptMapper deptMapper;

    public List<Dept> queryAll(){
  return deptMapper.queryAll();
}

    @Override
    public void del(Integer[] arr) {
        new Dept();
deptMapper.del(arr);
    }
}
