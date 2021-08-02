package com.kkb.controller;

import com.kkb.bean.JSONMessage;
import com.kkb.bean.Message;
import com.kkb.util.SMSTask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/stop")
public class StopServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SMSTask.end();
        JSONMessage json = new JSONMessage(0,"ok");
        response.getWriter().append(json.toJSON());
    }
}
