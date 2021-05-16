package com.zti.SeminarBootData.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestApi {

    @GetMapping("/helloWorld")
    public String hello(){
        return "Henlo";
    }

}