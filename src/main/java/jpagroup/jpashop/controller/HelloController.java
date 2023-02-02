package jpagroup.jpashop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        return "hello";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/generic")
    public String generic(){
        return "generic";
    }

}
