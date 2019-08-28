package top.cllccc.exam.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cllccc.exam.dao.common.dao.StudentMapper;
import top.cllccc.exam.domain.Student;
import top.cllccc.exam.domain.Time;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/22 15:31
 */
@Service
public class StudentService extends BaseService<Student> {

    @Autowired
    StudentMapper studentMapper;
}
