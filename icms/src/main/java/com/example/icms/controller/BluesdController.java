package com.example.icms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.BlueSd;
import service.BluesdService;


@Controller
@RequestMapping("/index")
public class BluesdController {
	
    @Autowired
    private BluesdService bluesdService;

    @RequestMapping(value="/viewDetail",method = RequestMethod.GET)
    public String viewBooks(Model model){
        List<BlueSd> details=bluesdService.viewDetails();
        model.addAttribute("details",details);
        return "index";
    }
}
