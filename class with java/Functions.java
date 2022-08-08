import java.util.*;

public class Functions {
    public static int printFactorial(int n) {
        if(n < 0) {
            System.out.println("Invalid Number");
            return 0;

        }
        int factorial = 1;
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
        return 0;

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);


    }
    
}
