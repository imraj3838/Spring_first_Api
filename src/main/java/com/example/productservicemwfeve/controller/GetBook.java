package com.example.productservicemwfeve.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Naman Bhalla

@RequestMapping("/books")
@RestController
public class GetBook {


    @GetMapping("/raj")
    public String BookController(){

        return "books";
    }
}

//// Code with durgesh
//My code 2
//
//@Controller
//public class GetBook{
//
//    @RequestMapping(value = "/books/raj" , method = RequestMethod.GET)
//    public String BookController(){
//        return "books";
//    }
//}