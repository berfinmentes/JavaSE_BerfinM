package week04.odev01;

public class Motorcycle extends Vehicle{
    boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
    }

    public Motorcycle() {
        super();
    }

    @Override
    void start() {
        super.start();
        System.out.println("Motorcycle is starting");
    }

    @Override
    void stop() {
        super.stop();
        System.out.println("Motorcycle is stopping");
    }
}
