public class Loops {
    public static void main(String[] args) {
        
      
        int index = 0;
        int sum = 0;

        //while
        while (index < 10) {
            sum += index;
            // sum = sum + x;

            System.out.println("Loop " + (index + 1));
            index++;
            // index = index + 1;
        }

        System.out.println("Sum: " + sum);

        int index2 = 0;
        int sum2 = 0;

       // Do while
        do {
            sum2 += index2;
            index2++;
            // index2 = index2 +1;
        }while(index2 < 10);

        System.out.println("Sum: " + sum2);
        
        //For
        int sum3 = 0; //not sure if this fixes it

        for (int index3 = 0; index3 < 10; index3++){
            sum3 += index3;
            
        }
        System.out.println("Sum: " + sum3);

    }
}
