import java.util.ArrayList;
import java.util.Random;

public class MainArrayList {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> grades = new ArrayList<Integer>();

        for(int x = 0; x < 10; x++) {
            int randomGrade = rand.nextInt(100) + 1;
            grades.add(randomGrade);
        }

        for (int index = 0; index < grades.size(); index++) {
            System.out.println("Grade: " + grades.get(index));
        }

        System.out.println();

        for (int grade : grades) {
            System.out.println("Grade: " + grade);
        }

    }
    
}
