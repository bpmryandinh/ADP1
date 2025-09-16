public class Main {
    public static void main(String[] args) {

        Auto karmannGhia = new Auto();
        karmannGhia.setModel("Karmman Ghia");
        karmannGhia.setGallonsOfGas(10);
        karmannGhia.setMilesDriven(1000);
        print(karmannGhia);

        Auto ford = new Auto("Ford", 25, 20000);
        print(ford);

    }

    private static void print(Auto auto) {
        System.out.println(auto.getModel());
        System.out.println(auto.getGallonsOfGas());
        System.out.println(auto.getMilesDriven());
    }
}
