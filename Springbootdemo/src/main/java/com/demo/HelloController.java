package com.demo;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

// this is call endpoint url api test
@GetMapping("/call") // call it by postman or direct from browser
String sayHello() {



String s = " hello india";

System.out.println("-->>>>>>>>>>"+s);



return s;



}



}