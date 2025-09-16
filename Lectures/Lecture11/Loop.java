import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean hasValidNumber = false;
        int grade = 0;

        while (hasValidNumber == false) {
        // while (!hasValidNumber) {
        
            System.out.println("Please enter a grade between 1 - 100");
        
            if (scan.hasNextInt()) {
                grade = scan.nextInt();

                if (grade >= 0 && grade <= 100) {
                    hasValidNumber = true;
                }
                
            } else {
                String garbageData = scan.nextLine();
            }
        }

        System.out.println("Grade: " + grade);

        scan.close();
    }
}