public class Main {
    public static void main(String[] args) {
        int grade = 60;

        String message = "";

        if (grade >= 60) {
            message = "You Passed";
        } else {
            message = "You Failed";
        }

        System.out.println(message);

    }
}