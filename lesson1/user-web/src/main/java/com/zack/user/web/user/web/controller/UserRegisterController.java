package com.zack.user.web.user.web.controller;

import com.zack.user.web.user.domain.User;
import com.zack.user.web.user.repository.InMemoryUserRepository;
import com.zack.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author zhouze
 * @date 2021/3/3
 */
@Path("/user")
public class UserRegisterController implements PageController {

    InMemoryUserRepository inMemoryUserRepository;

    public UserRegisterController() {
        inMemoryUserRepository = new InMemoryUserRepository();
    }

    @GET
    @Path("/register")
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        User user = new User();
        user.setId(1L);
        if (inMemoryUserRepository.save(user)) {
            return "register-success.jsp";
        } else {
            return "register-error.jsp";
        }
    }

}
