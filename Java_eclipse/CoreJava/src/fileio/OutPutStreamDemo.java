package fileio;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStreamDemo {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:\\java\\test.txt");
			System.out.println("file created...");
			String str = "this is my first io programe!!!";
			byte b[]=str.getBytes();
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
