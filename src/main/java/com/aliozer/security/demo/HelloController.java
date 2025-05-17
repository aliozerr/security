package com.aliozer.security.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> sayHelloApi(){
        return ResponseEntity.ok("You have successfully logined");
    }
}
