package hacker;

import java.security.Permission;
import java.util.Scanner;

public class Solution10 {
	public static void main(String[] args) {

		DoNotTerminate1.forbidExit();

		try {
			Scanner in = new Scanner(System.in);
			int n = in .nextInt();
			in.close();
			//String s=???; Complete this line below

			//Write your code here
			String s = Integer.toString(n);


			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (DoNotTerminate1.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate1 {

	public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1;
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}

