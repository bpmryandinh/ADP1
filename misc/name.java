import java.util.Random;

public class name {
    public static void main(String[] args) {
        
        Random rand = new Random();

        int die = rand.nextInt(2) +1;

        System.out.println("Dice rolled " + die);


    }
}
