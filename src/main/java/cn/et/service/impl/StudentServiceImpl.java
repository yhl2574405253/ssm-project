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

    public void insertStudent(Student student) {
        studentMapper.insertStudent(student);
    }

    public void deleteStudent(String id) {
        studentMapper.deleteStudent(id);
    }

    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }

    public List<Student> studentList() {
        List<Student> students = studentMapper.studentList();
        return students;
    }

    public Student studentById(String id) {
        return studentMapper.studentById(id);
    }

    public List<Student> studentQuery(Student student) {
        return studentMapper.studentQuery(student);
    }
}
