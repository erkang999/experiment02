package com.kang.mapper;

import com.kang.dao.s_school;
import com.kang.dao.s_student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IStudentMapper {


//    1. 查询 id=2 的课程信息；
    @Select("select * from s_student where id=#{id}")
    s_student select02(int id);

//            2. 查询出所有计算机学院开设的课程信息 ；
    @Select("select * from s_student where sid = (select id from s_school where schoolname='计算机学院')")
    List<s_student> selectCS();

//            3. 将 id=4 这⻔课程的课时数修改为 32+8=40；

    @Update("update s_student set hours=40 where id=4")
    void update04();

//            4. 插⼊⼀条新的课程记录： names=”⼤数据存储“，hours=32，schools =1；
    @Insert("insert into s_student values(null,'大数据',32,1)")
    void insert();

//            5. 输出所有的学院开设的课程信息
      @Select("select * from s_school")
      List<s_school> selectAll();




}
