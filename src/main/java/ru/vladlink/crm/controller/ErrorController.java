package ru.vladlink.crm.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ErrorController {

    public  String error(){
        return "error";
    }
}
