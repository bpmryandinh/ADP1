import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Determine if a number is Odd or Even");

        System.out.println("Enter Number 1");
        int number1 = scan.nextInt();

        int modulus = number1 % 2;

        if (modulus == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        


        /* 
        int add = number1 + number2;
        int subtract = number1 - number2;
        int multiply = number1 * number2;
        int divide = number1/number2;
        int modulus = number1 % number2;
        */
    }
}
