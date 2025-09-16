/*Variables
 */ 
public class Main{
    public static void main(String[] args) {

        int x = 5;
        int y = 6;
        int z = 1;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        z = x;
        x = y;
        y = z;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}