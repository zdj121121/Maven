package com.ZDJ.chapter1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

/*
 *
 * Created by ZDJ on 2017/6/10.
 */

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void  doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        DateFormat dataFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime=dataFormat.format(new Date());
        req.setAttribute("currentTime",currentTime);
        req.getRequestDispatcher("/jsp/hello.jsp").forward(req,resp);
    }
}
