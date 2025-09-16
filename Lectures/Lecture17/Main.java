import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        getNumber();
       
    }

    private static void getNumber() {
        boolean goodInput = false;
        
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a number:");
                int number = scan.nextInt();
                System.out.println(number);
                goodInput = true;
                scan.close();
            } catch (InputMismatchException ex) {
                System.out.println("Please enter a Whole number");
            } catch (Exception ex) {
                System.out.println("ERROR " + ex.getMessage());           
            } finally {
                System.out.println("FINALLY");
            }
        } while (!goodInput);
        
    }
}