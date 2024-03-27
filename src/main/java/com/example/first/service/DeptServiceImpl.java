package com.example.first.service;

import com.example.first.dao.DeptDao;
import com.example.first.dto.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;

    @Override
    public List<Dept> selectList() {
        return deptDao.selectList();
    }
}
