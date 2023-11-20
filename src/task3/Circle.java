package task3;

public class Circle extends Shape{
    private Double radius;
    private final Double PI = 3.1415;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return PI * Math.pow(radius,2);
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * PI * radius; //Длина окружности = периметр.
    }

    //Если вы хотите использовать сеттеры и геттеры для установки значения.
    public void setRadius(Double radius) {
        this.radius = radius;
    }
    public Double getRadius() {
        return radius;
    }


}
