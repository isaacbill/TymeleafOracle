package com.example.icms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.icms.model.Bluesd;
import com.example.icms.repository.BluesdRepository;

@Service
public class BluesdService {
	@Autowired
	private BluesdRepository eRepo;
	
	//get all records
	  public List<Bluesd> getAllDetails(){
	   List<Bluesd> list =  (List<Bluesd>)eRepo.findAll();
	   return list;
	  }
	// get record by keyword
	 public List<Bluesd> getByKeyword(String keyword){
		  return eRepo.findByKeyword(keyword);
		 }


}
