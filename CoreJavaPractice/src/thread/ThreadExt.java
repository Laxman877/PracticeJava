package thread;
class Y extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}
}
public class ThreadExt {
	public static void main(String[] args) {
		Y y=new Y();
		Thread t1=new Thread(y);
		t1.start();
	}
}
