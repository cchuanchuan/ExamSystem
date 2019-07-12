package top.cllccc.exam.controller;

import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.service.StudentService;

import java.util.List;
//该注解相当于private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
@Slf4j
@RequestMapping("/student")
@Controller("studentController")
public class StudentController {
    @Autowired
    private StudentService studentService;

    //private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    @RequestMapping("allStudent")
    @ResponseBody
    public List<Student> getAllStudent(){
        PageHelper.startPage(2, 2);//pageNum 页码  pageSize 每页显示条数
        List<Student> students = studentService.getAllStudent();
        log.info("获取所有student信息111");
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
