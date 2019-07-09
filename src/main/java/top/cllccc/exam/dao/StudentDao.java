package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;
import top.cllccc.exam.domain.Student;

import java.util.List;

@Mapper
public interface StudentDao {
    public Student queryStudentByNo(String no);
    public List<Student> queryAllStudent();
}
