package week04.odev01;

public class Main {
    public static void main(String[] args) {


        Car car = new Car("Mercedes ", "G63", 2023,4);
        car.start();
        car.stop();

        Motorcycle motorcycle = new Motorcycle("Yamaha","T-Max 560",2022,false);
        motorcycle.start();
        motorcycle.stop();

        Truck truck = new Truck("Mercedes ", "Actros ",2020,32.0);
        truck.start();
        truck.stop();
    }

}
