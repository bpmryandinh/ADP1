import java.util.Scanner;

public class Gradel71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //prompt user to enter total amount of grades
        System.out.println("How many grades do you want to enter? ");

        int gradeCount = scan.nextInt();

        int number = 0; 
        int sum = 0;

        int previousGrade = 0;
        int grade = 0;
        int sumGrades = 0;
        
        int max = 0;
        int min = 100;

        // do while loop 
        // prompt user to input each grade
         do {
            sum += gradeCount;
            number++;
            System.out.println("Enter grade " + number + ": ");
            grade = scan.nextInt();

            sumGrades += grade;
            
            if (grade > max) {
                max = grade;
            } 
            if (grade < min) {
                min = grade;
            }
        } while (number < gradeCount);
        System.out.println("Highest Grade: " + max);
        System.out.println("Lowest Grade: " + min);
        
        
        
        //Find Average (formula)
        int average = (sumGrades)/gradeCount;
        System.out.println("Average: " + average);
        
        previousGrade = grade; 

        scan.close();
        
    }
    public int max (int x, int y)
    {
        if (x > y)
            return x;
        else
            return y;
    }
}
