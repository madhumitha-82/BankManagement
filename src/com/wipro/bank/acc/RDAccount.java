package com.wipro.bank.acc;

public class RDAccount extends Account {
public  RDAccount(int tenure, float principal) {
this.tenure = tenure;
this.principal = principal;
}
public float calculateAmountDeposited() { 
	return principal*tenure*12;
}
public float calculateInterest() {
	float p = principal;//Principal.
	float r = getRateOfInterest()/100;//rateOfInterest/100. 
	float n = 4;//no of quarters in a year(4).
	float t = tenure/12.0f;//no of months remaining converted as years (60/12).
	return (float)(p*(Math.pow((1+r/n),n*t)-1)); 
}
}
