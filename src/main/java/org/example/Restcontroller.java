package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroller {
    @GetMapping("/home")
    public String get(){
        return "Hello World";
    }
}
