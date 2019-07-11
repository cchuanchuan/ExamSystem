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
    public List<Student> getAllStudent(){
        List<Student> students = studentService.getAllStudent();
        return students;
    }

    @RequestMapping("getStudentByNo")
    @ResponseBody
    public Student getStudentByNo(String studentNo){
        Student student = studentService.getStudentByNo(studentNo);
        return student;
    }

    @RequestMapping("getStudentByClass")
    @ResponseBody
    public List<Student> getStudentByClass(String classNo){
        return studentService.getStudentByClass(classNo);
    }

}
