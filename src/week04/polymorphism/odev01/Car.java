package week04.polymorphism.odev01;

public class Car extends Vehicle{
    int numDoors;

    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
    }

    public Car() {
        super();
    }


    @Override
    void start() {
        super.start();
        System.out.println("Car is starting");
    }

    @Override
    void stop() {
        super.stop();
        System.out.println("Car is stopping");
    }
}
