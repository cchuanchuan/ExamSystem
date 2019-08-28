package top.cllccc.exam.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;
import top.cllccc.exam.vo.ResponsePage;

import java.util.List;

/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/27 17:31
 */
@Service
@Slf4j
public abstract class BaseService<T> {
    @Autowired
    protected BaseMapper<T> baseMapper;

    public ResponsePage queryPage(int pageNum, int pageSize) {
        log.info("queryPage");
        ResponsePage responsePage = new ResponsePage();
        Page<T> page = PageHelper.startPage(pageNum,pageSize);

        List<T> list = baseMapper.selectAll();
        responsePage.setPageNum(pageNum);
        responsePage.setPageSize(pageSize);
        responsePage.setTotal(page.getTotal());
        responsePage.setData(list);
        return responsePage;
    }
}
