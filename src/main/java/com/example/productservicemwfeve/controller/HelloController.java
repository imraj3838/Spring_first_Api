package com.example.productservicemwfeve.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/Hello")
@RestController
public class HelloController {

    @GetMapping("/say/{name}/{times}")
    public String HelloController(@PathVariable String name, @PathVariable int times) {

        String ans = "";
        for (int i = 0; i < times; i++) {
            ans = ans + name + " ";
            ans = ans + "<br>";
        }
        return ans;
    }
}
