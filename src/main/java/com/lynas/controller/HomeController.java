package com.lynas.controller;

import com.lynas.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LynAs on 20-Jan-16
 */
@Controller
public class HomeController {

    @Autowired
    private ApplicationContext appContext;

    @Autowired
    AppUserService appUserService;

    @RequestMapping(value = "/")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/{id}")
    public String appUserByID(@PathVariable int id) {
        System.out.println(appUserService.getUserByID(id).getUserName());
        return "home";
    }
}
