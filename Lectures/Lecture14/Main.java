public class Main {
    public static void main(String[] args) {
        int [] grades = new int[3];

        grades[0] = 56;
        grades[1] = 98;
        grades[2] = 88;

        print("Grades", grades);

        // Temporary Array
        int [] temp = new int[10];
        print("Temp", temp);

        for (int index = 0; index < grades.length; index++) {
            temp[index] = grades[index];
        }

        print("Temp", temp);

        grades = temp;
        print("Grades", grades);

        temp = null;
        print("Temp", temp);

    }

    private static void print(String title, int[] grades) {
        System.out.println(title);
        for (int index = 0; index < grades.length; index++) {
            System.out.println(grades[index]);
        }
    }

    
}