package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount; 
import com.wipro.bank.exception.BankValidationException;

public class BankService {
 public boolean validateData(float principal, int tenure, int age, String gender) {
	 try {
	 if(principal>500 && 
	   (tenure==5||tenure==10) && 
	   (gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female")) && 
	   (age>1 && age<100)) {
		 return true; 
	 }
	 else {
		 throw new BankValidationException();
	 }
	 }catch(BankValidationException e){
		System.out.println(e);
	 }
	 return false;  
 }
 public void calculate(float principal, int tenure, int age, String gender) {
	 boolean Answer = validateData(principal, tenure, age, gender); 
	 if(Answer == true) {
		 RDAccount RDA = new RDAccount(tenure,principal); 
		  RDA.setInterest(age, gender);
		float Interest = RDA.calculateInterest();
		float AmountDeposited = RDA.calculateAmountDeposited();
		float MaturityAmount = RDA.calculateMaturityAmount(AmountDeposited ,Interest );
		System.out.println("Interest:"+Interest);
		System.out.println("Amount Deposited:"+AmountDeposited);
		System.out.println("Maturity Amount:"+MaturityAmount);
		System.out.println("Principal:"+RDA.rateOfInterest +"%");  
		
	 }

}
}
