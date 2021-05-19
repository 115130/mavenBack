package com.chinasofti.service;

import com.chinasofti.dao.BaseDao;
import com.chinasofti.dao.impl.EmpDaoImpl;
import com.chinasofti.entity.Emp;
import com.chinasofti.util.JdbcUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class EmpService {
    private final BaseDao<Emp>  empDao = new EmpDaoImpl();
    private static final DataSource dataSource = JdbcUtils.getDataSource();

    public EmpService() {
        ((EmpDaoImpl) empDao).setTemplate(new JdbcTemplate(dataSource));
    }

    public List<Emp> queryAllEmp() {
        return empDao.queryAll();
    }

    public int insert(Emp emp) {
        return empDao.insert(emp);
    }

    public int update(Emp emp) {
        return empDao.update(emp);
    }

    public int delete(int i) {
        return empDao.delete(i);
    }

    public List<Emp> queryEmpByPage(int i, int j) {
        return empDao.queryByPage(i, j);
    }
}
