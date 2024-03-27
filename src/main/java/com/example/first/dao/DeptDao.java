package com.example.first.dao;

import com.example.first.dto.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    public List<Dept> selectList();
}
