package assignment_array;
//W.A.J.P to remove a specific element from an array
import java.util.Arrays;
import java.util.Scanner;

public class I1_Arr {

	    public static void main(String[] args) {
	    	int[] value = { 1, 12, 3, 60, 5, 6, 20, 79, 35, 10 };
	    	System.out.print("This is your array: "+Arrays.toString(value));

	    	Scanner input = new Scanner(System.in);
	    	System.out.print("\n\nInput the index of the element you wanna remove: ");
	    	int Num = input.nextInt();

	    	int[] NewValue;
	    	NewValue = new int [9];
	    	int a = 0;

	    	for (int i = 0; i < value.length; i++) {
	    	if (i != Num) {
	    	NewValue[a] = value[i];
	    	a++;
	    	}
	    	}
	    	System.out.print("\nYour new array is: "+Arrays.toString(NewValue));
	    	
	    }
}
