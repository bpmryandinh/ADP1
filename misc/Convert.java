import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user to enter a value
        System.out.println("Please enter a value");


        // read in a Celsius Value
        double c = scan.nextDouble();


        // Convert value to F
        double f = (c * 1.8) + 32;


        // Print the result
        System.out.println(c  + "Celsius to Fahrenheit"  + f);

        scan.close();

         


    }
}
