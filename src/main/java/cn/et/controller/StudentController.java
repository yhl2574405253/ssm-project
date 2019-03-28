package cn.et.controller;

import cn.et.model.Student;
import cn.et.service.StudentService;
import cn.et.tool.CommonResponse;
import cn.et.tool.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("insertStudent")
    public Response insertStudent(Student student){
        studentService.insertStudent(student);
        return Response.success();
    }

    @RequestMapping("deleteStudent")
    public Response deleteStudent(String id){
        studentService.deleteStudent(id);
        return Response.success();
    }

    @RequestMapping("updateStudent")
    public Response updateStudent(Student student){
        studentService.updateStudent(student);
        return Response.success();
    }

    @RequestMapping("studentList")
    public Response studentList(){
        List<Student> students = studentService.studentList();
        return new CommonResponse<List<Student>>(students);
    }

    @RequestMapping("studentById")
    public Response studnetById(String id){
        Student student = studentService.studentById(id);
        return new CommonResponse<Student>(student);
    }

    @RequestMapping("studentQuery")
    public Response studentQuery(Student student){
        List<Student> students = studentService.studentQuery(student);
        return new CommonResponse<List<Student>>(students);
    }

}
