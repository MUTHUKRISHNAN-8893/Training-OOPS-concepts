class Car {
    void run() {
        System.out.println("Car is running fast");
    }
}

class Maruthi extends Car {
    void speed() {
        System.out.println("Maruthi is running slowly");
    }
}

class Swift extends Maruthi {
    void accident() {
        System.out.println("Swift is running fast");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Swift b1 = new Swift();
        b1.run();
        b1.speed();
        b1.accident();
    }
}