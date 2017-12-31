package com.dev.zj.app.business.controller;

import com.dev.zj.app.business.domain.User;
import com.dev.zj.app.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author P50
 * @date 2017/12/28 22:18
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/index/{id}")
    public String index(Model model,@PathVariable("id") Long id) {
        model.addAttribute("key1", "hello");
        model.addAttribute("key2", "Spring Boot");
        User byId = this.userService.getById(id);
        model.addAttribute("user", byId);
        return "index/index";
    }
}
