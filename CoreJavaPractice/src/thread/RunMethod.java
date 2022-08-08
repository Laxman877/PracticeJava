package thread;
class TestCallRun2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("Without calling start method: "+i);
		}
	}
}
public class RunMethod {
	public static void main(String[] args) {
		TestCallRun2 t1=new TestCallRun2();
		TestCallRun2 t2=new TestCallRun2();
		t1.run();
		t2.run();
		
	}
}
