package com.wipro.bank.main;
import java.util.*;

import com.wipro.bank.service.BankService;
public class Main {
public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the tenure period:");
	int tenure = sc.nextInt();
	System.out.println("Enter the principal amount:");
	int principal = sc.nextInt();
	System.out.println("Enter your age:");
	int age = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter your gender:");
	String gender = sc.nextLine();
	BankService SB = new BankService();
	SB.calculate(principal,tenure, age, gender);
	
}
}
