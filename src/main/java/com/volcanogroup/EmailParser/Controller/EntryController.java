package com.volcanogroup.EmailParser.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/home")
class EntryController{

    @GetMapping("/health")
    public String healthCheck(){
        return "healthy";
    }
}
