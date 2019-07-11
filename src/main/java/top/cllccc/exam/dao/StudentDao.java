package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;
import top.cllccc.exam.domain.Student;

import java.util.List;

@Mapper
public interface StudentDao {
    //根据学号查询
    public Student getStudentByNo(String studentNo);
    //查询所有
    public List<Student> getAllStudent();
    //根据班级查询
    public List<Student> getStudentByClass(String classNo);
    //增加信息
    public int addStudent(Student student);
    //删除信息
    public int deleteStudent(String studentNo);
    //修改信息
    public int updateStudent(Student student);
}
