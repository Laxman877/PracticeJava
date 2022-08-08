package fileio;

import java.io.File;
import java.io.IOException;

public class FileIODemo {
	public static void main(String[] args) {
		File file = new File("D:\\laxman\\test");
		file = new File("D:\\laxman\\test.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		file.mkdir();
		System.out.println("folder created");
//		if(file.exists()) {
//			System.out.println("available");
//			file.delete();
//			System.out.println("file deleted");
//		}else {
//			System.out.println("not available");
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
	}

}
