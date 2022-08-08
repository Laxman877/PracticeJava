package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\laxman\\hello.txt");
			String s = "hello surat hello it industry hello java";
			fw.write(s);
			fw.flush();
		}catch(IOException e) {
			e.printStackTrace();		}
	}

}
