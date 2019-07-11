package top.cllccc.exam.service;

import org.springframework.stereotype.Service;
import top.cllccc.exam.dao.StudentDao;
import top.cllccc.exam.domain.Student;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentService {

    @Resource
    private StudentDao studentDao;


    public List<Student> getAllStudent(){
        return studentDao.getAllStudent();
    }

    public Student getStudentByNo(String studentNo){
        return studentDao.getStudentByNo(studentNo);
    }

    public List<Student> getStudentByClass(String classNo){
        return studentDao.getStudentByClass(classNo);
    }

}
