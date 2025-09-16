import java.util.Scanner;
public class Gradebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Ask user for grade
        System.out.println("Please enter your grade?");
        int Grade = scan.nextInt();

        //State values for each letter
        if (Grade == 100) {
            System.out.println("A+");
            System.exit(0);
        }
        
        if ((Grade >= 90) && (Grade <= 99)) {
            System.out.print("Letter grade: A");
        } else if ((Grade >= 80) && (Grade <= 89)) {
            System.out.print("Letter grade: B");
        } else if ((Grade >= 70) && (Grade <= 79)) {
            System.out.print("Letter grade: C");
        } else if ((Grade >= 60) && (Grade <= 69)) {
            System.out.print("Letter grade: D");
        }else if (Grade <= 59) {
            System.out.print("Letter grade: F");
        }


        int secondDigit = Grade % 10;

        //Statement for each letter grade (-, blank, and +)

        if ((Grade > 59) && (Grade < 95)) {
            if (secondDigit >= 0 && secondDigit <= 4) {
                System.out.println("-");
            }  else if (secondDigit >= 6 && secondDigit <= 9) {
                System.out.println("+");
            }

        }


        System.out.println(" ");
        scan.close();
    }
}
