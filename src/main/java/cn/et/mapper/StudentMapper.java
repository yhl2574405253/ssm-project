package cn.et.mapper;

import cn.et.model.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StudentMapper {
     /**
      * 添加
      * @param student
      */
     void insertStudent(@Param("student") Student student);

     /**
      * 删除
      * @param id
      */
     @Delete("delete from student where sid=#{id}")
     void deleteStudent(@Param("id") String id);

     /**
      * 修改
      * @param student
      */
     void updateStudent(@Param("student") Student student);


     /**
      * 查询所有
      * @return
      */
    @Results({
        @Result(column = "sid",property = "id"),
        @Result(column = "sname",property = "name"),
        @Result(column = "sage",property = "age"),
        @Result(column = "ssex",property = "sex")
    })
    @Select("select * from student")
    List<Student> studentList();

     /**
      * 根据id查询单个
      * @param id
      * @return
      */
     @Results({
             @Result(column = "sid",property = "id"),
             @Result(column = "sname",property = "name"),
             @Result(column = "sage",property = "age"),
             @Result(column = "ssex",property = "sex")
     })
     @Select("select * from student where sid=#{id}")
    Student studentById(@Param("id") String id);

     /**
      * 根据条件查询
      * @param student
      * @return
      */
    List<Student> studentQuery(@Param("student") Student student);


}
