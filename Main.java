interface vehicle {
    void start();
    void stop();
}
class car implements vehicle {
    public void start() {
        System.out.println("Car started with key ignition");
    }
    public void stop() {
        System.out.println("Car stopped by pressing brake");
    }
}
class bike implements vehicle {
    public void start() {
        System.out.println("Bike started by pedaling");
    }
    public void stop() {
        System.out.println("Bike stopped by pressing brake");
    }
}

public class Main {

    public static void main(String[] args) {

        car c1 = new car();
        c1.start();
        c1.stop();

        bike b1 = new bike();
        b1.start();
        b1.stop();
    }
}