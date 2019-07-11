package top.cllccc.exam.dao;

import org.apache.ibatis.annotations.Mapper;
import top.cllccc.exam.domain.Department;

import java.util.List;

@Mapper
public interface DepartmentDao {
    public Department getDepartmentByNo(String depNo);
    public List<Department> getAllDepartment();
    public int addDepartment(Department department);
    public int deleteDepartment(String depNo);
    public int updateDepartment(Department department);
}
