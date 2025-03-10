import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nWelcome to the Inefficient Calculator");
        System.out.println("            WOWZERS!!!!               ");
        System.out.println();
        
         //user inputs number1 to compute
        System.out.print("Enter one number: ");
        int x = scan.nextInt(); 
 
        //space
        System.out.println();
        
        //intialize variable for while loop
        boolean run = true;

       // dowhile loop for operations and inputting second number
        do {
          
        //User inputs operation
        System.out.println("MENU: \n" + " ADD, " + "+\n" +
                        " SUBTRACT, " + "-\n" + 
                        " MULTIPLY, " + "*\n" + 
                        " DIVIDE, " + "/\n" +
                        " MODULUS, " + "%\n"+
                        " EXIT," + "e"); 
                        
        System.out.print(" Select an Action: ");
        String operation = scan.next();
        operation = operation.toUpperCase();

        //exit function
        if (operation.equalsIgnoreCase("EXIT") || operation.equalsIgnoreCase("E")){
            System.out.println("\nThank you for using the Inefficient Calculator! \n");
            System.exit(0);
        } 
    

        //user inputs number2 to compute
        System.out.print("\nEnter second number: ");
        int y = scan.nextInt(); 

        System.out.println(); //line space

        //switch
        int answer; 
        
         switch (operation) {

            //addtion
            case "ADD": 
            case "+":
             answer = ADD (x, y);
             System.out.println("Result: " + answer + "\n");
            break;

            //subtraction
            case "SUBTRACT": 
            case "-":
            answer = SUBTRACT(x, y);
            System.out.println("Result: " + answer + "\n");
            break;

            //multiplication
            case "MULTIPLY":
            case "*":
            answer = MULTIPLY(x, y);
            System.out.println("Result: " + answer + "\n");
            break;

            //divison
            case "DIVIDE": 
            case "/":
            if (y == 0){
                System.out.println("Cannot divide by zero");
            } else {
                answer = DIVIDE(x, y);
                System.out.println("Result: " + answer + "\n");
            } 
            break;

            //Modulus
            case "MODULUS":
            case "%":
            answer = MODULUS(x, y);
            System.out.println("Result: " + answer + "\n");
            break;

            default:
                System.out.println("Unrecognized option\n");
            }
            
    }  while (run);
       
    scan.close();

    } 

//methods for each operation
    //ADD
    public static int ADD (int x, int y){
        return x + y;
    }

    //SUBTRACT
    public static int SUBTRACT (int x, int y){
        return x - y; 
    }

    //MULTIPLY
    public static int MULTIPLY (int x, int y){
        return x * y; 
    }

    //DIVIDE 
    public static int DIVIDE (int x, int y){
        return x / y;
    }

    //MODULUS
    public static int MODULUS (int x, int y){
        return x % y;
    }
}      
