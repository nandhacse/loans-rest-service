package com.mc.rest.webservices.restfulwebservicesloans.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mc.rest.webservices.restfulwebservicesloans.model.Loan;


@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer>{
	List<Loan> findByUserId(String userId);
}
