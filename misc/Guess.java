import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Computer chooses a random number between 1-100
        double number1 = (Math.random() * 100) + 1 ; 
        number1 = Math.round(number1);

        //Prompt user to input a number between 1-100
        System.out.println("Please type a number");

        double user = scan.nextDouble();

        //Print computer's number and user's number (answer: you:) 
        System.out.println("Answer: " + number1);
        System.out.println("You: " + user);

        //Calculate the differnce between the user's number and the computer's number
        double number2 = Math.abs(number1 - user); 
        
        //Print calculated difference
        System.out.println("Difference: " + number2);


        //print score depending on difference 

        if (number2 == 0) {
        System.out.println("Score = 100");
        } else if ((number2 > 0) && (number2 < 25)) {
            System.out.println("Score = 50");
        } else if (number2 >= 25) {
            System.out.println("Score = 10");
        }
        
        // (else (differnce > 0) && (difference < 25) println(x:"Score = 50"))
        // (else (difference >= 25) println(x:"Score = 10"))
    }
}
