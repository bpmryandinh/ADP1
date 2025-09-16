import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //prompt user to input how mnay students (row)
        System.out.println("How many students do you want to enter grades in for?");
        int student = scan.nextInt();

        //prompt user to input how many grades (column)
        System.out.println("How many grades do you want to enter?");
        int grades = scan.nextInt();
        

        //create array and initalize variables
        double [][] gradeBook;
        gradeBook = new double[student][grades];
        double [] averages = new double[student];
        double Overall = 0;
        int count = 0;
        int sum = 0;

        //user input grades
        for (int s = 0; s < gradeBook.length; s++){ //for student
            System.out.println("\nEnter Student " + (s+1) ); 
            for (int g = 0; g < gradeBook[s].length; g++){ //for grade
                System.out.print("  Grade " + (g+1) + ": " ); 
                
                //save number of grades and students in gradeBook
                gradeBook[s][g] = scan.nextDouble();

                //save sum of number of student and grades inputed 
                sum += gradeBook[s][g]; // sum = sum + (s * g)

                //counts how many 
                count += 1; //count = count + 1         
            }
        }
        
        //calculate the average for each student
       for (int st = 0; st < gradeBook.length; st++){
            double average = 0;
            for (int gb = 0; gb < gradeBook[st].length; gb++){
                //calculate the average for each students 
                average += gradeBook[st][gb];
                
            }

        averages [st] = average / gradeBook.length;
            //average for all students
            Overall = sum/count;
        }

        //prints student
        for (int s = 0; s < gradeBook.length; s++){
            System.out.println();
            System.out.println("Student " + (s+1) );

            //print grades
            for (int g = 0; g < gradeBook[s].length; g++){ 
                System.out.println("  Grade " + (g+1) + " : " + gradeBook[s][g]);
            }
        }

        //print averages
        for (int sAvg = 0; sAvg < gradeBook.length; sAvg++){
            System.out.println("\nAverage of Student " + sAvg + ": " + averages[sAvg]);
        }
        
        //find why student and grade start at 0  
        //find why array can't do "non-squared" arrays
        
        System.out.println("\nOverall Student Average: " + Overall + "\n");   
    
        scan.close();
        
    }
} 