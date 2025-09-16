public class Input {
    public static void main(String[] args) {
       
        System.out.println("What is your name?");

        String name = System.console().readLine();
        System.out.println("Name entered: " + name);

        System.out.print("Enter Number 1:");
        int number1 = Integer.parseInt(System.console().readLine());

        System.out.print("Enter Number 2:");
        String number2string = System.console().readLine();
        int number2 = Integer.parseInt(number2string);

        int total = number1 + number2;  

        System.out.println(total);


    }
}
