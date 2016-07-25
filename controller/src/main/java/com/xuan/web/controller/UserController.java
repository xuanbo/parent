package com.xuan.web.controller;

import com.xuan.web.entity.User;
import com.xuan.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xinQing on 2016/7/25.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String user(@PathVariable Integer id, ModelMap modelMap) {
        User user = userService.get(id);
        modelMap.addAttribute("user", user);
        return "user";
    }
}
