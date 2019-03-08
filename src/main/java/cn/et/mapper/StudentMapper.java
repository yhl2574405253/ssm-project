package cn.et.mapper;

import cn.et.model.Student;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    @Results({
        @Result(column = "sid",property = "id"),
        @Result(column = "sname",property = "name"),
        @Result(column = "sage",property = "age"),
        @Result(column = "ssex",property = "sex")
    })
    @Select("select * from student")
     List<Student> studentList();
}
