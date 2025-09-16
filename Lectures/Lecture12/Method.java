public class Method {
    public static void main(String[] args) {
        sayHello();
        sayWorld();
        say("Hello");
        say("World");
    }

    private static void sayHello() {
        System.out.println("Hello");
    }

    private static void sayWorld() {
        System.out.println("World");
    }

    private static void say(String message) {
        System.out.println(message);
    }
}