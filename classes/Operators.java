public class Operators {
    public static void main(String[] args) {
        int x = 200;
        int y = 250;
        int z = 300;
        if(x>y) {
            if(x>z) {
                System.out.println("x is greater");
            }
        }
        if(y>z) {
            System.out.println("y is greater");
        } else {
            System.out.println("z is greater");
        }
    }
}