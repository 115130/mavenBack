package com.chinasofti;

import com.chinasofti.entity.Emp;
import com.chinasofti.service.EmpService;
import com.chinasofti.util.JdbcUtils;

import javax.sql.DataSource;
import java.util.List;

public class miao {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            EmpService service = new EmpService();
            List<Emp> emps = service.queryAllEmp();
            System.out.println(emps);
            System.out.println(i);
        }
    }
}