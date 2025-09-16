import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //User inputs numbers of elements
        System.out.println("How many elements of the Fibonacci series do you want to print?");
        int elements = scan.nextInt();

        //declare variable 
        int number1 = 0;
        int number2 = 1;
        int number3 = 1;
        
        
        // "for" loops 
        for (int i = 0; i < elements; i++){
            if (i == 0){
                System.out.print("0 "); 
            } else {
                System.out.print(number3 + " "); // 0 1 1 2 3 5
                number3 = number1 + number2;
                number1 = number2;
                number2 = number3;           
            }     
        }
        scan.close();
        //starts with 0 
        // nextNumber = 0 + 1
        // loop nextNumber + previousNumber 

       
       
    }
}
