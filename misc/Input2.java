import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number 1:");
        int number1 = scan.nextInt();

        System.out.println("Enter Number 2:");
        int number2 = scan.nextInt();

        int total = number1 + number2;
        System.out.println(total);

        scan.close();

    }
}
