import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int [] grades = new int[3];

        grades[0] = 56;
        grades[1] = 98;
        grades[2] = 88;

        print("Grades", grades);

        // Temporary Array
        int [] temp = Arrays.copyOf(grades, 10);
        print("Temp", temp);

        grades = temp;
        print("Grades", grades);
        
        temp = null;
        


    }

    private static void print(String title, int[] grades) {
        System.out.println(title);
        for (int index = 0; index < grades.length; index++) {
            System.out.println(grades[index]);
        }
    }

    
}