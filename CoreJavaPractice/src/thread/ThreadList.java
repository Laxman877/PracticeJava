package thread;
class ThreadGroup1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
}
public class ThreadList {
	public static void main(String[] args) {
		ThreadGroup1 MyRunnable=new ThreadGroup1();
		
		ThreadGroup tg1=new ThreadGroup("Parent ThreadGroup");
		
		Thread t1=new Thread(tg1, MyRunnable,"one");
		Thread t2=new Thread(tg1, MyRunnable,"two");
		Thread t3=new Thread(tg1, MyRunnable,"three");
		
		System.out.println("Thread Group Name: "+tg1.getName());
		tg1.list();
		t1.start();
		t2.start();
		t3.start();
	}
}
