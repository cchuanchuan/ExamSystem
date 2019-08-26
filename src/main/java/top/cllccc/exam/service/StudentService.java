package top.cllccc.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cllccc.exam.dao.common.dao.StudentMapper;
import top.cllccc.exam.domain.Student;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/22 15:31
 */
@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public Student queryStudent(Student student){
        Student queryStudent = studentMapper.selectOne(student);

        return queryStudent;
    }
}
