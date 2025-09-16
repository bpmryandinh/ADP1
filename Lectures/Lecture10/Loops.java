public class Loops {
    public static void main(String[] args) {
        
        int index = 0;
        int sum = 0;

        // While
        while (index < 10) {
            sum += index;
            // sum = sum + index;

//            System.out.println("Loop " + (index + 1));
            index++;
            // index = index + 1;
        }

        System.out.println("Sum: " + sum);

        int index2 = 0;
        int sum2 = 0;


        // Do
        do {
            sum2 += index2;
            index2++;
        } while(index2 < 10);

        System.out.println("Sum: " + sum2);

        int sum3 = 0;
        // For
        for (int index3 = 0; index3 < 10; index3++) {
            sum3 += index3;
        }

        System.out.println("Sum: " + sum3);

    }
}