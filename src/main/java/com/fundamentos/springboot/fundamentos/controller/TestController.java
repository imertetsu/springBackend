package com.fundamentos.springboot.fundamentos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    //nos sirve para aceptar todas las solicitudes a nivel http
    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> function(){
        return new ResponseEntity<>("Hello from Controller", HttpStatus.OK);
    }
}
