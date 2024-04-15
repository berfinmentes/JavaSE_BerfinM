package week04.polymorphism.odev01;

public class Truck extends Vehicle{
    double cargoCapacity;

    public Truck(String brand, String model, int year, double cargoCapacity) {
        super(brand, model, year);
    }

    public Truck() {
        super();
    }

    @Override
    void start() {
        super.start();
        System.out.println("Truck is starting");
    }

    @Override
    void stop() {
        super.stop();
        System.out.println("Truck is stopping");
    }
}
