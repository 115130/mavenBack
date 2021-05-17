package com.chinasofti.service;

import com.chinasofti.dao.BaseDao;
import com.chinasofti.dao.impl.EmpDaoImpl;
import com.chinasofti.entity.Emp;
import com.chinasofti.util.JdbcUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class EmpService {
    BaseDao<Emp> empDao = new EmpDaoImpl();



    public List<Emp> queryAllEmp() {
        DataSource dataSource = JdbcUtils.getDataSource();
        ((EmpDaoImpl) empDao).setTemplate(new JdbcTemplate(dataSource));
        return empDao.queryAll();

    }


    public int insert(Emp emp) {
        ((EmpDaoImpl) empDao).setTemplate(new JdbcTemplate(JdbcUtils.getDataSource()));
        return empDao.insert(emp);
    }

    public int update(Emp emp) {
        ((EmpDaoImpl) empDao).setTemplate(new JdbcTemplate(JdbcUtils.getDataSource()));
        return empDao.update(emp);
    }

    public int delete(int i) {
        ((EmpDaoImpl) empDao).setTemplate(new JdbcTemplate(JdbcUtils.getDataSource()));
        return empDao.delete(i);
    }

    public List<Emp> queryEmpByPage(int i, int j) {
        ((EmpDaoImpl) empDao).setTemplate(new JdbcTemplate(JdbcUtils.getDataSource()));
        return empDao.queryByPage(i,j);
    }
}
