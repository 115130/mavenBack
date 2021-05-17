package com.chinasofti.util;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletUtil {
    public static void printWriter(HttpServletResponse resp,String s) throws IOException {
        PrintWriter out = resp.getWriter();
        out.write(s);
        out.flush();
        out.close();
    }
}
