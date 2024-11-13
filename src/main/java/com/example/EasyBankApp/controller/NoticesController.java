package com.example.EasyBankApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/myNotices")
    public String getNotices(){
        return "My account notices";
    }
}
