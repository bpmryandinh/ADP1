public class Main2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        try {
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException ex) {
            System.out.println("Cannot Divide by Zero");
        }


    }
    
}
