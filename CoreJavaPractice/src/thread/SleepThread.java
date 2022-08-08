package thread;
class Th1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("Th1: "+i);
		}
	}
}
class Th2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("Th2: "+i);
		}
	}
}
public class SleepThread {
	public static void main(String[] args) {
		Th1 t1=new Th1();
		Th2 t2=new Th2();
//		in run method thread will be execute serially
//		t1.run();
//		t2.run();
//		in start method both thread will execute parallel
		t1.start();
		t2.start();
	}
}
