package dev.doha.auth.controller;

import dev.doha.auth.infra.AuthenticationFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    private final AuthenticationFacade authenticationFacade;

    @Autowired
    public HomeController(AuthenticationFacade authenticationFacade){
        this.authenticationFacade = authenticationFacade;
    }

    @GetMapping
    public String home(){
        try {
            logger.info("connected user: {}",
                    authenticationFacade.getUserName());
            logger.info(authenticationFacade.getAuthentication().getClass().toString());
        } catch (NullPointerException e) {
            logger.info("no user logged in");
        }
        return "index";
    }
}
