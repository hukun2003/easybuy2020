package com.buy.web;

import com.buy.entity.EasybuyUser;
import com.buy.service.user.IUserService;
import com.buy.service.user.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegistServlet",urlPatterns = {"/regist"})
public class RegistServlet extends HttpServlet {
    private IUserService userService=null;

    @Override
    public void init() throws ServletException {

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        String loginName=request.getParameter("loginName");
        String userName=request.getParameter("loginName");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
        String mobile=request.getParameter("mobile");
        EasybuyUser  user=new EasybuyUser();
        user.setUsername(userName);
        user.setLoginname(loginName);
        user.setPassword(password);
        user.setEmail(email);
        user.setMobile(mobile);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
