package Basics;

public class Pattern1 {
	public static void main(String[] args) {
        int i = 1;
        while(i<=5) {
        	int j = 1;
        	while(j<=i) {
        		System.out.print("*");
        		j = j + 1;
        	}
            System.out.println("\n");
            i = i + 1;
        }   
    }
}
