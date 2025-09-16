import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        int grade = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter your Grade:");
            grade = scan.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println("Please enter a number between 0 and");
            }

        } while (grade < 0 || grade > 100);

        System.out.println("You grade is " + grade);

        scan.close();

    }
    
}
