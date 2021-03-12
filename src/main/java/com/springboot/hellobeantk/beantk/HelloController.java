package com.springboot.hellobeantk.beantk;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getVersion(){
        return "Hello Btalk V2.0";
    }
}
