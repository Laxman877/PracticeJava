package thread;
class ThreadRunnableimpl implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
	}
	
}
public class MainThread {
	public static void main(String[] args) {
		ThreadRunnableimpl t=new ThreadRunnableimpl();
		Thread t1=new Thread(t);
		t1.start();
	}
}
