public class Main3 {
   public static void main(String[] args) {
    int [] grades = { 50, 60, 70, 80 };

    try {
        if (grades.length == 5)
            System.out.println(grades[4]);
    } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println(ex.getMessage());
    } catch (Exception ex) {
        System.out.println("NOT SURE WHY THIS CRASHED BUT IT DID");
        System.out.println(ex.getMessage());
    }



   } 
}
