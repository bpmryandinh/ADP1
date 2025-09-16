import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = 1;


        while (number < 101) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.print("Fizz Buzz, ");
            } else if (number % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (number % 5 == 0) {
                System.out.print("Buzz, ");
            } else {
                System.out.print(number + ", ");
            }
            number++;   
    }
        scan.close();

    
}
}

   // print (1-100)
       /* while (number < 100) {
            if (number % 3 == 0) { //checks if x is divisible by 3
                System.out.print("Fizz, ");
            } else if (number % 5 == 0) {
                System.out.print("Buzz, ");              
            } else if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Fizz Buzz, ");
            } else {
                System.out.print(number + ", ");
            }
            number++;
    } */