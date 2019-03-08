package cn.et.controller;

import cn.et.model.Student;
import cn.et.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("studentList")
    @ResponseBody
    public List<Student> studentList(){
        List<Student> students = studentService.studentList();
        return students;
    }

    @RequestMapping("test1")
    @ResponseBody
    public String test(){
        return "SUCCESS";
    }
}
