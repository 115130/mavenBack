package com.chinasofti.dao.impl;


import com.chinasofti.dao.BaseDao;
import com.chinasofti.entity.Emp;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class EmpDaoImpl implements BaseDao<Emp> {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Emp> queryAll() {
        String sql = "select * from emp";

        return template.query(sql, new BeanPropertyRowMapper<>(Emp.class));

    }

    @Override
    public int insert(Emp emp) {
        String sql = "insert into emp (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values(?,?,?,?,?,?,?,?)";
        return template.update(sql, emp.getEmpNo(), emp.geteName(), emp.getJob(), emp.getMgr(), emp.getHiredate(), emp.getSal(), emp.getComm(), emp.getDeptNo());
    }

    @Override
    public int update(Emp emp) {
        String sql = "update emp set ENAME=?,JOB=?,MGR=?,HIREDATE=?,SAL=?,COMM=?,DEPTNO=? where EMPNO=?";
        return template.update(sql, emp.geteName(), emp.getJob(), emp.getMgr(), emp.getHiredate(), emp.getSal(), emp.getComm(), emp.getDeptNo(), emp.getEmpNo());
    }

    @Override
    public int delete(int i) {
        String sql = "delete  from emp where EMPNO=?";
        return template.update(sql, i);
    }

    @Override
    public List<Emp> queryByPage(int i, int j) {
        String sql = "select * from emp limit ?,?";
        return template.query(sql, new BeanPropertyRowMapper<>(Emp.class), i, j);
    }

    @Override
    public List<Emp> queryByName(String name) {
        String sql = "select * from emp where ENAME like ?";
        return template.query(sql, new BeanPropertyRowMapper<>(Emp.class), "%"+name+"%");
    }
}
