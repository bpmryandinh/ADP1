import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        
        Random rand = new Random();

        int die = rand.nextInt(6) + 1;

        System.out.println("Dice rolled " + die);

        int number = Math.abs(-5);


    }
    
}
