import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0; 
        int min = 100;
        int max = 0;
        final int NUMBER_OF_GRADES = 25;

        //Loop read in 5 grades
        for (int index = 1; index <= NUMBER_OF_GRADES; index++){
            System.out.println("Please enter a grade (" + index +  " of " + NUMBER_OF_GRADES + "): ");
            System.out.println("Please enter a grade (");
            System.out.print(index);
            System.out.println(" of ");
            System.out.print(NUMBER_OF_GRADES);
            System.out.print("): ");
            int grade = scan.nextInt();
            sum += grade;

            //Keep track of lowest grade
            if (grade < min) {
                min = grade;
            }

            //Keep track of highest grade
            if (grade > max){
                max = grade;
            }

            System.out.println("Grade: " + grade);
        
        }
        //Calculate Average 
        double average = (double)sum / NUMBER_OF_GRADES; 
        System.out.println("Average :" + average);


        //Print High and Low grades
        System.out.println("Highest grade: " + max);
        System.out.println("Lowest grade: " + min);

        


        scan.close();
    }
}
