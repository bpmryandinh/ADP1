public class Main {
    public static void main(String[] args) {
        
        Cat fluffy = new Cat();
        fluffy.setName("Fluffy");
        fluffy.play();
        fluffy.play();
        fluffy.play();
        fluffy.feed();


        Cat sam = new Cat("Sam");
        for (int x=0;x < 10; x++) {
            sam.play();
        }
        




    }

}