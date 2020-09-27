package com.mc.rest.webservices.restfulwebservicesloans.controller;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mc.rest.webservices.restfulwebservicesloans.model.Loan;
import com.mc.rest.webservices.restfulwebservicesloans.service.LoanRepository;


@RestController
public class LoanController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private LoanRepository loanRepository;
	
	@GetMapping("/loans")
	public List<Loan> retrieveAllUsers(){
		return loanRepository.findAll();
	}
	
	@PostMapping("/loans/create/{id}")
	public ResponseEntity<Loan> createUser(@PathVariable int id, @RequestBody Loan loan) {
		loan.setUserId(String.valueOf(id));
		Loan newLoan = loanRepository.save(loan);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newLoan.getId()).toUri();
		logger.info("{}", location);
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping("/loans/{id}")
	public List<Loan> retrieveUserById(@PathVariable int id){
		return loanRepository.findByUserId(String.valueOf(id));
	}	
	
	@DeleteMapping("/loans/{id}")
	public void deleteUserById(@PathVariable int id){
		loanRepository.deleteById(id);
	}
}
