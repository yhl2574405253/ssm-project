package cn.et.service;

import cn.et.model.Student;

import java.util.List;

public interface StudentService {
    /**
     * 添加
     * @param student
     */
    void insertStudent(Student student);

    /**
     * 删除
     * @param id
     */
    void deleteStudent(String id);

    /**
     * 修改
     * @param student
     */
    void updateStudent(Student student);


    /**
     * 查询所有
     * @return
     */
    List<Student> studentList();

    /**
     * 根据id查询单个
     * @param id
     * @return
     */
    Student studentById(String id);

    /**
     * 根据条件查询
     * @param student
     * @return
     */
    List<Student> studentQuery(Student student);

}
