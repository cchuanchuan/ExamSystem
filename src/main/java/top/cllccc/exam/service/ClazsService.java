package top.cllccc.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cllccc.exam.dao.ClazsDao;
import top.cllccc.exam.domain.Clazs;

import java.util.List;

@Service("clazsService")
public class ClazsService {

    @Autowired
    private ClazsDao clazsDao;

    public Clazs getClazsByNo(String class_no){
        return clazsDao.getClazsByNo(class_no);
    }
}
