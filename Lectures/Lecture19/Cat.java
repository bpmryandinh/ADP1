public class Cat {
    private int mood;
    private int energy;
    private int hungry;
    private String name;

    public Cat() {
        name = "NO NAME";
        mood = 2;
        this.energy = 2;
        this.hungry = 0;
        checkStatus();
    }

    public Cat(String name) {
        this.name = name;
        mood = 3;
        this.energy = 3;
        this.hungry = 0;
        checkStatus();
    }

    public void setName(String name) {
        this.name = name;
    }

    private void sleep() {
        //print();
        System.out.println(this.name + " is sleeping");
        energy++;
        hungry++;
    }

    public void feed() {
       
        System.out.println(this.name + " was feed");
        mood++;
        hungry--;
        meow();
//        print();
    }

    public void play() {
        print();
        System.out.println(this.name + " is playing");
        mood++;
        energy--;
        meow();
    }

    private void meow() {
        System.out.println("Meow!!");
    }

    private void checkStatus() {
        if (energy == 0) {
            sleep();
        }

        if (hungry == 2) {
            feed();
        }

        if (energy < 0) {
            System.out.println("Cat is DEAD");
            System.exit(0);
        }
        if (hungry > 2) {
            System.out.println("Cat sarved to DEATH");
            System.exit(0);
        }
            
    }

    private void print() {
        checkStatus();
        System.out.println(this.name);
        System.out.println("Energy: " + this.energy);
        System.out.println("Hungry: " + hungry);
        System.out.println("Mood: " + this.mood);
    }
    
}
