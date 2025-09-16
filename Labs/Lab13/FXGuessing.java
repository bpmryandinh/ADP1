import java.util.Scanner;

public class FXGuessing {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    String run = "YES";
    

    while (run.equalsIgnoreCase("YES")) {
        
        say("Guess a number between 1 - 100"); //Prompts user guess number 
        double user = scan.nextDouble();

        double number1 = (Math.random() * 100) + 1 ; //computer random number
        number1 = Math.round(number1);

        System.out.println("Do you wish to try again?");
        run = scan.next();
        }  

//METHODS 
    }
    private static void enterNumber(){ //Prompts user guess number METHOD
        System.out.println("Please type a number");
    }
    private static void say(String message) {
        System.out.println(message);
    }

    public static double sub(double number1, double user) {
        double sub = Math.abs(number1 - user);
         return sub;
        } 

    public static void userValue(double difference) {
        if (difference == 0) { //score based on difference METHOD
            System.out.println("Score = 100");
        } else if ((difference > 0) && (difference < 25)) {
            System.out.println("Score = 50");
        } else if (difference >= 25) {
            System.out.println("Score = 10");
        }       
    } 
}