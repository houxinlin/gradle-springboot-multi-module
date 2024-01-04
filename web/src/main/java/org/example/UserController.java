package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("get")
    public String getUser(@RequestParam("name")String name){
        return name;
    }
    @GetMapping("")
    public String index(){
        return "a";
    }
}
