package dev.doha.auth.controller;

import dev.doha.auth.controller.dto.UserDto;
import dev.doha.auth.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(){
        return "login-form";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup-form";
    }

    @PostMapping("/signup")
    public String signUpPost(@ModelAttribute UserDto userDto){
        userService.createUser(userDto);
        return "redirect:/home";
    }


}