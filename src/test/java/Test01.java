import com.kang.dao.s_school;
import com.kang.dao.s_student;
import com.kang.mapper.IStudentMapper;
import com.kang.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Test01 {

    SqlSession session = MyBatisUtils.getSession();
    IStudentMapper mapper = session.getMapper(IStudentMapper.class);

    public static void main(String[] args) {

    }

    @Test
    public  void test_selectAll()
    {
        List<s_school> s_schools = mapper.selectAll();
        System.out.println(s_schools);
    }

    @Test
    public void test_select02()
    {
        s_student s_student = mapper.select02(2);
        System.out.println(s_student);
    }


    @Test
    public void test_selectCS()
    {
        List<s_student> s_students = mapper.selectCS();
        System.out.println(s_students);
    }



    @Test
    public void test_update04()
    {
      mapper.update04();
      session.commit();// 提交事务；。。
    }

    @Test
    public void test_insert()
    {
        mapper.insert();
        session.commit();// 提交事务；。。
    }


}
