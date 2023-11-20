package task3;

public class Rectangle extends Shape{
    private Double length;
    private Double width;

    public Rectangle() {
    }

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double calculateArea() {
        return length * width;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * (length + width);
    }

    //Если вы хотите использовать сеттеры и геттеры для установки значения.
    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
