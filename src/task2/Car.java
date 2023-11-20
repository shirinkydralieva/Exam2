package task2;

public class Car extends Vehicle{
    public Car() {
    }

    public Car(String make, Integer year) {
        super(make, year);
    }

    @Override
    void start() {
        System.out.println("Car has started.");
    }

    @Override
    void stop() {
        System.out.println("Car has started.");
    }

    @Override
    public String toString() {
        return "Car: " + super.toString();
    }
}
