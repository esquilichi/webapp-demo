package com.urjc.es.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WebController {

    @RequestMapping("/")
    public ModelAndView helloworld(){
        ModelAndView mvc = new ModelAndView("index");
        mvc.addObject("name", "Andorra!");
        return mvc;
    }

}
