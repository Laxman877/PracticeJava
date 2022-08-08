package thread;
class Priority extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread running..");
	}
}
public class NamePriority {
	public static void main(String[] args) {
		Priority p1=new Priority();
		Priority p2=new Priority();
		p1.setName("Th1");
		p2.setName("Th2");
		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(p1.getName()+" "+p1.getPriority());
		System.out.println( p2.getName()+" "+p2.getPriority());
		p1.start();
		p2.start();
	}
}
