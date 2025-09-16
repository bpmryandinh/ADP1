import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double [] bills = new double[4];

        System.out.println("Please enter your bills:");

        for (int index = 0; index < bills.length; index++) {
            System.out.println("Enter Bill # " + (index + 1));
            bills[index] = scan.nextDouble();
        }

        printBills(bills);
        printHighestBill(bills);
        printLowestBill(bills);
        printAverageOfBills(bills);

        scan.close();
    }

    private static void printBills(double [] _bills) {

        for(double b : _bills) {
            System.out.println(b);
        }

//        for(int index = 0; index < _bills.length; index++) {
//            System.out.println(_bills[index]);
//        }
    }

    private static void printHighestBill(double [] _bills) {
        double max = 0.0;

        for (int index = 0; index < _bills.length; index++) {
            if (_bills[index] > max) {
                max = _bills[index];
            }
        }

        System.out.println("Highest Bill is " + max);
    }

    private static void printLowestBill(double [] _bills) {
        int minIndex = 0;

        for (int index = 0; index < _bills.length; index++) {
            if (_bills[index] < _bills[minIndex]) {
                minIndex = index;
            }
        }

        System.out.println("Lowest Bill is " + _bills[minIndex]);
    }

    private static void printAverageOfBills(double [] _bills) {
        double sum = 0.0;

        for (int index = 0; index < _bills.length; index++) {
            sum = sum + _bills[index];
            // sum += _bills[index];
        }

        double average = sum / _bills.length;

        System.out.println("The average is " + average);

    }
}