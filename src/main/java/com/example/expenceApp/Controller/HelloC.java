package com.example.expenceApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloC {
  @GetMapping("/") 
public String hello() {
    return "hello";
}
}
