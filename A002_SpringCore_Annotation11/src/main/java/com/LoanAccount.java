package com;

import org.springframework.stereotype.Component;

@Component
public class LoanAccount implements BankAccount {
	
	
	public void getBalance() {
		System.out.println("This is loan account balance!!");
	}
}
