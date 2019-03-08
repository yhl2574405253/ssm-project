package cn.et.service;

import cn.et.model.Student;

import java.util.List;

public interface StudentService {
    /**
     * 查询所有的学生
     * @return
     */
     List<Student> studentList();
}
