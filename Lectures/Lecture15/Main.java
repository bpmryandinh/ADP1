import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
     
        System.out.println("1 Dim Array");
        // 1 dim array
        int [] grades = new int[5];

        for (int row = 0; row < grades.length; row++) {
            grades[row] = generateRandomGrade(100);
        }

        for (int row = 0; row < grades.length; row++) {
            System.out.println("Grade :" + grades[row]);
        }
        
        System.out.println();

        System.out.println("2 Dim Array");
        // 2 dim array Students and Grades
        int [] [] studentGrades = new int[20][5];

        for (int row = 0; row < studentGrades.length; row++) {
            for (int col = 0; col < studentGrades[row].length; col++) {
                studentGrades[row][col] = generateRandomGrade(100);
            }
        }

        for (int row = 0; row < studentGrades.length; row++) {
            System.out.println("Student: " + row);
            for (int col = 0; col < studentGrades[row].length; col++) {
                System.out.println("\tGrade " + col + " Value: " + studentGrades[row][col]);
//                System.out.println("Row:" + row + " Col: " + col + " Value: " + studentGrades[row][col]);
            }
        }

        System.out.println();
        
        System.out.println("3 Dim Array");
        // 3 dim array Semester, Students and Grades
        int [][][] semesterStudentGrades = new int[8][20][15];

        for (int semester = 0; semester < semesterStudentGrades.length; semester++) {
            for (int student = 0; student < semesterStudentGrades[semester].length; student++) {
                for (int grade = 0; grade < semesterStudentGrades[semester][student].length; grade++) {
                    semesterStudentGrades[semester][student][grade] = generateRandomGrade(100);
                }

            }
        }

        for (int semester = 0; semester < semesterStudentGrades.length; semester++) {
            System.out.println("Semester:" + semester);
            for (int student = 0; student < semesterStudentGrades[semester].length; student++) {
                System.out.println("\tStudent:" + student);
                for (int grade = 0; grade < semesterStudentGrades[semester][student].length; grade++) {
                    System.out.print("\t" + semesterStudentGrades[semester][student][grade]);
                }
                System.out.println();
            }
        }




    }

    private static int generateRandomGrade(int base) {
        Random rand = new Random();
        return rand.nextInt(base) + 1;
//        return randomGrade; 
    }
}