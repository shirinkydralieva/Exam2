package task2;

public class TransportManagementSystem {
    public static void main(String[] args) {
        Car car = new Car("Honda", 2013);
        Bike bike = new Bike("BMW", 2015);
        Bus bus = new Bus("SETRA", 2019);

        System.out.println(car);
        car.start();
        car.stop();
        System.out.println(bike);
        bike.start();
        bike.stop();
        System.out.println(bus);
        bus.start();
        bus.stop();
    }
}
