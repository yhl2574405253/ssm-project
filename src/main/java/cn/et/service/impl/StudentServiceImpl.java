package cn.et.service.impl;

import cn.et.mapper.StudentMapper;
import cn.et.model.Student;
import cn.et.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    /**
     * 查询所有的学生
     * @return
     */
    public List<Student> studentList() {
        List<Student> students = studentMapper.studentList();
        return students;
    }
}
