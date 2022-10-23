package com.eagleLearns.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.eagleLearns.springboot.repository.NotesRepository;
import com.eagleLearns.springboot.entity.Notes;

//import antlr.collections.List;

@RestController
@CrossOrigin("*")
// Using CrossOrigin will enable  any host to call this service
@RequestMapping("/api")
public class NotesController {

	
	@Autowired
	NotesRepository nRepo;
	
	
	@GetMapping("/notes")
	public  ResponseEntity<List<Notes>> readNotes(){
		
		return new ResponseEntity<List<Notes>> (nRepo.findAll(),HttpStatus.OK);
		
	}
	@PostMapping("/notes")
	public ResponseEntity<Notes> createNote(@RequestBody Notes note){
		return new  ResponseEntity<Notes>(nRepo.save(note),HttpStatus.CREATED);
	} 
		
		
}
