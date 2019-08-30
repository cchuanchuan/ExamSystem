package top.cllccc.exam.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;
import top.cllccc.exam.constants.ResponseCode;
import top.cllccc.exam.vo.Response;
import top.cllccc.exam.vo.ResponsePage;

import java.util.List;
/*
 * 通用Mapper常用方法:
 *
 * 等号的CRUD:
 * List<T> select(T record); 根据实体中的属性值进行查询，查询条件使用等号
 * T selectByPrimaryKey(Object key); 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
 * List<T> selectAll(); 查询全部结果，select(null)方法能达到同样的效果
 * T selectOne(T record); 根据实体中的属性进行查询，只能有一个返回值，有多个结果是抛出异常，查询条件使用等号
 * int selectCount(T record); 根据实体中的属性查询总数，查询条件使用等号
 * int insert(T record); 保存一个实体，null的属性也会保存，不会使用数据库默认值
 * int insertSelective(T record); 保存一个实体，null的属性不会保存，会使用数据库默认值
 * int updateByPrimaryKey(T record); 根据主键更新实体全部字段，null值会被更新
 * int updateByPrimaryKeySelective(T record); 根据主键更新属性不为null的值
 * int delete(T record); 根据实体属性作为条件进行删除，查询条件使用等号
 * int deleteByPrimaryKey(Object key); 根据主键字段进行删除，方法参数必须包含完整的主键属性
 *
 * 条件的CRUD:
 * List<T> selectByCondition(Object condition); 根据Condition条件进行查询
 * int selectCountByCondition(Object condition); 根据Condition条件进行查询总数
 * int updateByCondition(@Param("record") T record, @Param("example") Object condition); 根据Condition条件更新实体record包含的全部属性，null值会被更新
 * int updateByConditionSelective(@Param("record") T record, @Param("example") Object condition); 根据Condition条件更新实体record包含的不是null的属性值
 * int deleteByCondition(Object condition); 根据Condition条件删除数据
 *
 * */
/**
 * <h1></h1>
 *
 * @Author: CCC
 * @Date 2019/8/27 17:31
 */
@Service("baseService")
@Slf4j
public abstract class BaseService<T> {

    @Autowired
    protected BaseMapper<T> baseMapper;

    /**
     * 查询一页数据
     * @param pageNum 第pageNum页
     * @param pageSize 每页大小
     * @return {@link ResponsePage} 返回数据，包含页面信息
     */
    public ResponsePage queryPage(int pageNum, int pageSize) {
        log.info("queryPage");
        ResponsePage responsePage = new ResponsePage();
        Page<T> page = PageHelper.startPage(pageNum,pageSize);

        List<T> list = baseMapper.selectAll();

        if(list == null || list.size()== 0){ // 未查询到数据
            responsePage.setCode(ResponseCode.QUERY_FAILURE.getCode());
            responsePage.setMessage(ResponseCode.QUERY_FAILURE.getMessage());
        }
        responsePage.setPageNum(pageNum);
        responsePage.setPageSize(pageSize);
        responsePage.setTotal(page.getTotal());
        responsePage.setData(list);
        return responsePage;
    }

    /**
     * 查询所有数据
     * @return {@link Response}
     */
    public Response queryAll(){
        log.info("queryAll");
        Response response = new Response();

        List<T> list = baseMapper.selectAll();

        if(list == null || list.size()== 0){ // 未查询到数据
            response.setCode(ResponseCode.QUERY_FAILURE.getCode());
            response.setMessage(ResponseCode.QUERY_FAILURE.getMessage());
        }
        response.setData(list);
        return response;
    }

    /**
     * 根据T中条件查询
     * @param t 条件
     * @return {@link Response}
     */
    public Response queryAllByCondition(T t){
        log.info("queryAllByCondition");
        Response response = new Response();

        List<T> list = baseMapper.select(t);

        if(list == null || list.size()== 0){ // 未查询到数据
            response.setCode(ResponseCode.QUERY_FAILURE.getCode());
            response.setMessage(ResponseCode.QUERY_FAILURE.getMessage());
        }
        response.setData(list);
        return response;
    }

    /**
     * 根据条件查找页
     * @param pageNum 页码
     * @param pageSize 每页大小
     * @param t 条件
     * @return {@link ResponsePage}
     */
    public ResponsePage queryPageByCondition(int pageNum, int pageSize, T t) {
        log.info("queryPageByCondition");
        ResponsePage responsePage = new ResponsePage();
        Page<T> page = PageHelper.startPage(pageNum,pageSize);

        List<T> list = baseMapper.select(t); // 根据t的调价查找

        if(list == null || list.size()== 0){ // 未查询到数据
            responsePage.setCode(ResponseCode.QUERY_FAILURE.getCode());
            responsePage.setMessage(ResponseCode.QUERY_FAILURE.getMessage());
        }
        responsePage.setPageNum(pageNum);
        responsePage.setPageSize(pageSize);
        responsePage.setTotal(page.getTotal());
        responsePage.setData(list);
        return responsePage;
    }

    /**
     * 增加一条记录
     * @param t 对应对象
     * @return {@link Response} 返回插入结果
     */
    public Response addObject(T t){
        log.info("addObject");
        Response response = new Response();
        int result = baseMapper.insert(t);
        response.setData(result);

        // 插入失败
        if(result <= 0){
            response.setCode(ResponseCode.INSERT_FAILURE.getCode());
            response.setMessage(ResponseCode.INSERT_FAILURE.getMessage());
        }
        return response;
    }

    /**
     * 更新一条记录
     * @param t 对应对象
     * @return {@link Response}
     */
    public Response updateObject(T t){
        log.info("uodateObject");
        Response response = new Response();
        int result = baseMapper.updateByPrimaryKeySelective(t); // 通过主键更新,只更细t中不为空的字段
        response.setData(result);

        // 更新失败
        if(result <= 0){
            response.setCode(ResponseCode.UPDATE_FAILURE.getCode());
            response.setMessage(ResponseCode.UPDATE_FAILURE.getMessage());
        }
        return response;
    }

    /**
     * 删除一条记录
     * @param t
     * @return
     */
    public Response deleteObject(T t){
        log.info("deleteObject");
        Response response = new Response();
        int result = baseMapper.delete(t);
        response.setData(result);

        // 删除失败
        if(result <= 0){
            response.setCode(ResponseCode.DELETE_FAILURE.getCode());
            response.setMessage(ResponseCode.DELETE_FAILURE.getMessage());
        }
        return response;
    }
}
