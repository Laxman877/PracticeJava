package hacker;

import java.util.Scanner;

public class Solution01 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String result;
        System.out.println("enter number");
        int N = s.nextInt();
        if(N%2 == 0) {
            if( (N >=2 && N <=5) || N > 20) {
                result = "Not Weird";
            } else {
                result = "Weird";
            }
        } else {
            result = "Weird";
        }
        System.out.println(result);
    }
}
