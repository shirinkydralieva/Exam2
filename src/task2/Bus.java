package task2;

public class Bus extends Vehicle{
    public Bus() {
    }

    public Bus(String make, Integer year) {
        super(make, year);
    }

    @Override
    void start() {
        System.out.println("Bus has started.");
    }

    @Override
    void stop() {
        System.out.println("Bus has started.");
    }

    @Override
    public String toString() {
        return "Bus: " + super.toString();
    }
}
