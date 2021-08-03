/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaspercloud.DataPolicyManagement.controller;

import com.gaspercloud.DataPolicyManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author gasperthompson
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "userpage";
    }
}
