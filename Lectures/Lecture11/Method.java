public class Method {
    public static void main(String[] args) {
        
        print("Hello World");
        print("Jeff Maxwell");

        String helloMessage = sayHello("Jeff maxwell");
        print(helloMessage);
    }
    
    public static void print(String message) {
        System.out.println(message);
    }

    private static String sayHello(String message) {
        return "Hello " + message;
    }


}
