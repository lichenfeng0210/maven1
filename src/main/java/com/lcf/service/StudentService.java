package com.lcf.service;

import com.github.pagehelper.PageInfo;
import com.lcf.entity.Student;

/**
 * @author BigData - lcf
 * @create 2020-11-10 10:24
 */
public interface StudentService {
    PageInfo<Student> list(Integer pageNum,Integer pageSize);
}
