package com.jdann.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("hi/there/")
public class MyRestController {

    @RolesAllowed("THIS")
    @GetMapping(value = "guy")
    public String guy() {
        return "Hi there guy";
    }
}
