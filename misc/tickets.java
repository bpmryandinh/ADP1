import java.util.Scanner; 

public class tickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kidCount = 0;
        int adultCount = 0;
        int seniorCount = 0; 

        int counter = -1; 

        while (counter != 0) {
                System.out.println("How many Kid Tickets do you want? ");
                int kidTicket = scan.nextInt();
                kidCount += kidTicket;

                System.out.println("How many Adult Tickets do you want? ");
                int adultTicket = scan.nextInt();
                adultCount += adultTicket;

                System.out.println("How many Senior Tickets do you want? ");
                int seniorTicket = scan.nextInt();
                seniorCount += seniorTicket;

                counter = kidTicket + adultTicket + seniorTicket; 

        }

        System.out.println("Kid Tickets: " + kidCount);
        System.out.println("Adult Tickets " + adultCount);
        System.out.println("Senior Tickets " + seniorCount);

        scan.close();
    }
}
