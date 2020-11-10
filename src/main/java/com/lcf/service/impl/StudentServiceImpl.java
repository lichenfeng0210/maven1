package com.lcf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lcf.dao.StudentMapper;
import com.lcf.entity.Student;
import com.lcf.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author BigData - lcf
 * @create 2020-11-10 10:26
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper mapper;
    @Override
    public PageInfo<Student> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Student> list = mapper.list();
        return new PageInfo<>(list);
    }
}
