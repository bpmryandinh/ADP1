public class Params {
    public static void main(String[] args) {
        System.out.println("You passed in " + args.length + " arguments");

        for (String argument : args) {
            if (argument.equalsIgnoreCase("-version")) {
                System.out.println("Version: 1.0.1.1");
            }

//            System.out.println(argument);
        }

        System.out.println("***************");
        
        for (int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }

    }
}
