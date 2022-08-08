package fileio;
//take input from user their name and mail id and create file name and write mail id in java file.
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Name_Email_O {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your name: ");
		String str = sc.nextLine();
		System.out.println("please enter your email id: ");
		String str1 = sc.nextLine();
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:\\Java\\"+str);
			System.out.println("file created...");
			byte b[]=str1.getBytes();
			fos.write(b);
			System.out.println("content written...");
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
