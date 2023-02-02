package jpagroup.jpashop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/include")
public class IncludeController {
    public static final Logger logger = LoggerFactory.getLogger(IncludeController.class);

    @RequestMapping("/head")
    public String head(){
        return "/include/head";
    }

    @RequestMapping("/header")
    public String header(Model model){
        return "/include/header";
    }

}
