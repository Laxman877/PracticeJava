package basicpracticle;
class Demo{
	public void display() {
		System.out.println("running display...");
	}
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("result is : "+c);
	}
	public int square(int a) {
		int sq = a*a;
		return sq;
	}
	public void arrayAdd(int a[]) {
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("sum of array is: "+sum);
	}
	public int[] revArray(int a[]) {
		int b[]=new int[a.length];
		int c=0;
		for(int i=a.length-1;i>=0;i--) {
			b[c]=a[i];
			c++;
		}
		return b;
	}
	public void sum(int...a) {
		System.out.println("var.args calling...");
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			
		}
		System.out.println("sum of array : "+sum);
	}
}
public class Practice {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.display();
		d.add(25, 15);
		int sq=d.square(5);
		System.out.println("square is : "+sq);
		System.out.println("square is of 6 is: "+d.square(6));
		int a[]= {10,20,30,40,50};
		d.arrayAdd(a);
		int b[]=d.revArray(a);
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
		d.sum(90,80,70,60,50,40);
	}
}
