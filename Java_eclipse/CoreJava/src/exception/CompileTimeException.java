package exception;

public class CompileTimeException {

	public static void main(String[] args) {
		try {
			Class.forName("exception.FirstException");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
//		String str = "1231";
//		int i = Integer.parseInt(str);
//		System.out.println(i);
	}
}
