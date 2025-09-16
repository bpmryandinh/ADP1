import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculating Largest Number between 3 values");
        
        System.out.println("Enter Number 1:");
        int number1 = scan.nextInt();

        System.out.println("Enter Number 2:");
        int number2 = scan.nextInt();

        System.out.println("Enter Number 3:");
        int number3 = scan.nextInt();

        int largestValue = 0;

        if ((number1 > number2) && (number1 > number3)) {
            largestValue = number1;
        } else if ((number2 > number3)) {
            largestValue = number2;
        } else {
            largestValue = number3;
        }

        System.out.println(largestValue);

    }
}
