package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		BankAccount saving=new SavingAccount();
//		BankAccount loan =new LoanAccount();
//		BankAccount current =new CurrentAccount();
//		saving.getBalance();
//		loan.getBalance();
//		current.getBalance();
		AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(AppConfig.class);
		BankAccount account1=contex.getBean("savingAccount",SavingAccount.class);
		account1.getBalance();
//		BankAccount account2=contex.getBean("loanAccount",LoanAccount.class);
//		account2.getBalance();
//		BankAccount account3=contex.getBean("currentAccount",CurrentAccount.class);
//		account3.getBalance();
	}
}
