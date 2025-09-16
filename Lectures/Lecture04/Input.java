public class Input {
    public static void main(String[] args) {

        System.out.println("What is your name?");

        String name = System.console().readLine();
        System.out.println("Name entered: " + name);

        System.out.print("Enter Number 1:");
        String number1String = System.console().readLine();
        int number1 = Integer.parseInt(number1String);

        System.out.print("Enter Number 2:");
        String number2String = System.console().readLine();
        int number2 = Integer.parseInt(number2String);

        int total = number1 + number2;
        System.out.println(total);


    }
}