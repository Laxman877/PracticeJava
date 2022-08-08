package fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Name_Email_I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your file name: ");
		String s = sc.nextLine();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\Java\\"+s);
			int i = fis.read();
			System.out.println("your email id is: ");
			while(i!=-1) {
				char c = (char)i;
				System.out.print(c);
				i = fis.read();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
