public class Main {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();

        Computer gamingComputer = new Computer.Builder("AMD Ryzen 7", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3060")
                .build();

        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}
