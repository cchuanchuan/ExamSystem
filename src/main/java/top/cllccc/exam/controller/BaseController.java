package top.cllccc.exam.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.cllccc.exam.service.BaseService;

/**
 * <h1>通用Controller</h1>
 *
 * @Author: CCC
 * @Date 2019/8/29 15:18
 */
@Slf4j
public abstract class BaseController<T> {

    public abstract BaseService<T> getBaseService();

    @GetMapping("queryPage")
    public String queryPage(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                   @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        log.info("queryPage: pageNum=" + pageNum + "pageSize=" + pageSize);
        return JSONObject.toJSONString(getBaseService().queryPage(pageNum, pageSize));
    }

    @GetMapping("queryAll")
    public String queryPage() {
        log.info("queryAll");
        return JSONObject.toJSONString(getBaseService().queryAll());
    }

    @PostMapping("queryAllByCondition")
    public String queryAllByCondition(@RequestBody T t) {
        log.info("queryAllByCondition");
        return JSONObject.toJSONString(getBaseService().queryAllByCondition(t));
    }

    @PostMapping("queryPageByCondition")
    public String queryPageByCondition(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                            @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                            @RequestBody T t ) {
        log.info("queryPageByCondition: pageNum=" + pageNum + ",pageSize=" + pageSize);
        log.info("queryPageByCondition: Object="+t);
        return JSONObject.toJSONString(getBaseService().queryPageByCondition(pageNum, pageSize, t));
    }



    @PostMapping("add")
    public String add(@RequestBody T t) {
        log.info("addObject: Object=" + t);
        return JSONObject.toJSONString( getBaseService().addObject(t));
    }

    @PutMapping("update")
    public String update(@RequestBody T t) {
        log.info("updateObject: Object=" + t);
        return JSONObject.toJSONString( getBaseService().updateObject(t));
    }

    @DeleteMapping("delete")
    public String delete(@RequestBody T t) {
        log.info("deleteObject: Object=" + t);
        return JSONObject.toJSONString( getBaseService().deleteObject(t));
    }
}
