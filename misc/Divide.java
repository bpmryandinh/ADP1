import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number 1:");
        int number1 = scan.nextInt();

        System.out.println("Enter Number 2");
        int number2 = scan.nextInt();

        //int value = number1/number2;
        //System.out.println(value);

        if (number2 != 0) {
            System.out.println("Divided Value" + number1/number2);



        }
    }
}
