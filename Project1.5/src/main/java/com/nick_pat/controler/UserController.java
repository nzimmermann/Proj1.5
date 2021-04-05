package com.nick_pat.controler;

import com.google.gson.Gson;
import com.nick_pat.model.User;
import com.nick_pat.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserController {

    UserService us;

    public UserController(UserService us) {this.us = us;}




    public void getUser(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //int id = Integer.parseInt(req.getParameter("id"));
        User u = us.getUserById(1);

        Gson gson = new Gson();

        res.getWriter().println(gson.toJson(u));

    }

}
