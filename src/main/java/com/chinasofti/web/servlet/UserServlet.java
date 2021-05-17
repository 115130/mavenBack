package com.chinasofti.web.servlet;

import com.alibaba.fastjson.JSON;
import com.chinasofti.entity.Emp;
import com.chinasofti.service.EmpService;
import com.chinasofti.util.ServletUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/userServlet")
public class UserServlet extends BaseServlet {
    public void addUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("addUser");
        writer.flush();
        writer.close();
    }

    public void queryAllUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        EmpService service = new EmpService();
        List<Emp> emps = service.queryAllEmp();
        String s = JSON.toJSONString(emps);
        s=s.toUpperCase();
        ServletUtil.printWriter(resp, s);

    }

    public void updateUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("updateUser");
        writer.flush();
        writer.close();

    }

    public void deleteUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("deleteUser");
        writer.flush();
        writer.close();

    }
}
