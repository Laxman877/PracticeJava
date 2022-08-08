package thread;
class FirstThread extends Thread{
	public void display(String msg) {
		// TODO Auto-generated method stub
		System.out.print("["+msg);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class SecondThread extends Thread {
	String msg;
	FirstThread fobj;
	public SecondThread(FirstThread fnew, String msg) {
		this.fobj = fnew;
		this.msg = msg;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (fobj) {
			fobj.display(msg);
		}
	}
}
public class ThreadSync {
	public static void main(String[] args) {
		FirstThread fnew=new FirstThread();
		SecondThread s1=new SecondThread(fnew, "Welcome");
		SecondThread s2=new SecondThread(fnew, "new");
		SecondThread s3=new SecondThread(fnew, "programmer");
		s1.start();
		s3.start();
		s2.start();
	}
}
