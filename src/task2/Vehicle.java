package task2;

public abstract class Vehicle {
    private String make;
    private Integer year;

    public Vehicle() {
    }

    public Vehicle(String make, Integer year) {
        this.make = make;
        this.year = year;
    }

    abstract void start();
    abstract void stop();

    @Override
    public String toString() {
        return "\nmake:" + make +
                "\nyear:" + year;
    }

    public String getMake() {
        return make;
    }

    //Если вы хотите использовать сеттеры и геттеры для установки значения.
    public void setMake(String make) {
        this.make = make;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
