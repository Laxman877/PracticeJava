package exception;

import java.util.Scanner;

public class AgeOperation {
	static void validate(int age) throws AgeInvalidException{
		if(age<18) {
			throw new AgeInvalidException("age is not valid to vote");
		}else {
			System.out.println("age is valid to vote");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int i = sc.nextInt();
		try {
			validate(i);
		}catch(AgeInvalidException e) {
			e.printStackTrace();
		}
	}

}
