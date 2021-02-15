package be.intecbrussel.blogapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

    @RequestMapping({"","/","/registration"})
    public String getRegistrationPage(){
        return "registration";
    }
}
