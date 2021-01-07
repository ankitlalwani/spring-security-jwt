package com.example.springsecurityjwt.controllers;

import com.example.springsecurityjwt.model.JwtUser;
import com.example.springsecurityjwt.security.JwtGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {


    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator){
        this.jwtGenerator=jwtGenerator;
    }

    @PostMapping
    public String generateToken(@RequestBody JwtUser jwtUser){

        return jwtGenerator.generate(jwtUser);

    }
}
