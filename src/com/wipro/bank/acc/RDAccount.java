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
	float r = rateOfInterest;//rateOfInterest/100. 
	float n = r/(12*100.0f);//no of quarters in a year(4).
	float t = tenure*12;//no of months remaining converted as years (60/12).
	double maturityAmount = p* ((Math.pow(1+n, t)-1)/n)*(1+n);
	double totalDeposited = calculateAmountDeposited();
	return (float)(maturityAmount - totalDeposited); 
} 
}
