import java.util.Scanner;

/**
 * CalcMethod Program
 */
public class CalcMethod {
    static Scanner scan = new Scanner(System.in);

    /**
     * Main Method
     * @param args
     */
    public static void main(String[] args) {
        int number1 = readInNumber("Enter the first Number:");
        int number2 = readInNumber("Enter the second Number:");

        printTotal(number1, number2);

        scan.close();
    }

    /**
     * Read In Number
     * 
     * Takes in a prompt, reads a number and returns that number
     * 
     * @param prompt
     * @return number
     */
    private static int readInNumber(String prompt) {
        System.out.println(prompt);
        int number = scan.nextInt();
        
        return number;
    }

    /**
     * Print Total
     * 
     * Takes in two numbers adds them and prints out the total
     * 
     * @param number1
     * @param number2
     */
    private static void printTotal(int number1, int number2) {
        int total = number1 + number2;
        System.out.println("Total: " + total);
        System.out.println("Total2: " +(number1 + number2));
    }
    
}
