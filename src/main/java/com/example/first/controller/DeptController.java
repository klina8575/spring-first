package com.example.first.controller;

import com.example.first.dto.Dept;
import com.example.first.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    DeptService deptservice;

    @GetMapping("/main")
    public List<Dept> main() {
        List<Dept> list = deptservice.selectList();
        return list;
    }
}
