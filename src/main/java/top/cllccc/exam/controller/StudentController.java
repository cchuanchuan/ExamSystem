package top.cllccc.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.service.StudentService;

import java.util.List;

@RequestMapping("/student")
@Controller("studentController")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("allStudent")
    @ResponseBody
    public List<Student> queryAllStudent(){
        List<Student> students = studentService.queryAllStudent();
        return students;
    }

    @RequestMapping("queryStudentByNo")
    @ResponseBody
    public Student queryStudentByNo(String no){
        Student student = studentService.queryStudentByNo(no);
        return student;
    }

}
