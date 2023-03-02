
package com.example.icms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.icms.model.Bluesd;
import com.example.icms.repository.BluesdRepository;
import com.example.icms.service.BluesdService;

@Controller
public class BluesdController {
//	@Autowired
//	BluesdRepository bluesdRepository;
//	
//	    //get all entries
//		@GetMapping("/index")
//		public String list(Model model) {
//		    model.addAttribute("Records",bluesdRepository.findAll());
//		    return "index";
//		}
	 @Autowired
	 private BluesdService service;
	 @RequestMapping(path = {"/","/search"})
	 public String home(Bluesd employee, Model model, String keyword) {
	  if(keyword!=null) {
	   List<Bluesd> list = service.getByKeyword(keyword);
	   model.addAttribute("list", list);
	  }else {
	  List<Bluesd> list = service.getAllDetails();
	  model.addAttribute("list", list);}
	  return "index";
	 }

}
