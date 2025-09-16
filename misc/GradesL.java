import java.io.Closeable;

public class GradesL {
    public static void main(String[] args) {
        int grade = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter your grade");
            grade = scan.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println("Please enter a number between 0 and 100");
            }

        }while (grade < 0 || grade > 100);

        System.out.println("Your grade is " + grade);

        scan.close();
 }
}