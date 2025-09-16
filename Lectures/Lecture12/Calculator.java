import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first Number:");
        int number1 = scan.nextInt();

        System.out.println("Enter the second Number:");
        int number2 = scan.nextInt();

        int total = number1 + number2;
        System.out.println("Total: " + total);

        scan.close();
    }
    
}
