package com.mc.rest.webservices.restfulwebservicesloans.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Loan {
	@Id
	@GeneratedValue
	private Integer id;
	private String loanType;
	private Date appliedDate;
	private double rateOfInterest;
	private int duration;
	private double loanAmount;
	
	private String userId;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Loan() {
		
	}
	
	public Loan(Integer id, String loanType, Date appliedDate, double rateOfInterest, int duration, double loanAmount) {
		super();
		this.id = id;
		this.loanType = loanType;
		this.appliedDate = appliedDate;
		this.rateOfInterest = rateOfInterest;
		this.duration = duration;
		this.loanAmount = loanAmount;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public Date getAppliedDate() {
		return appliedDate;
	}
	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
}
