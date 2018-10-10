package com.muki.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/vet")
public class VetController {

    @RequestMapping({"/vet","/vet/index","/vet/index.html"})
    public String listVets()
    {
        return "vet/index";
    }
}
