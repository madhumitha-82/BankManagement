package com.wipro.bank.acc;
abstract class Account {
int tenure;//total no of years.
float principal;
private float rateOfInterest;
public void setInterest(int age, String gender) {
	if(age<60 && gender.equalsIgnoreCase("Male")) {
		setRateOfInterest(9.8f);
	}
	else if(age>=60 && gender.equalsIgnoreCase("Male")) {
		setRateOfInterest(10.5f);
	}
	else if(age<58 && gender.equalsIgnoreCase("Female")) {
		setRateOfInterest(10.2f);
	}
	else {
		setRateOfInterest(10.8f);
	}
}
 public float calculateMaturityAmount(float totalPrincipleDeposited, float maturityInterest){
	return totalPrincipleDeposited + maturityInterest;
}
 public abstract float calculateInterest();
 public abstract float calculateAmountDeposited();
 public float getRateOfInterest() {
	return rateOfInterest;
 }
 public void setRateOfInterest(float rateOfInterest) {
	this.rateOfInterest = rateOfInterest;
 }
}
