package task3;

public class GeometryCalculator {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(71.0, 54.9);
        Circle circle = new Circle(13.5);
        RightTriangle rightTriangle = new RightTriangle(3.0,4.0,5.0);
        System.out.println("Rectangle: area = " + rectangle.calculateArea() + ", perimeter = " + rectangle.calculatePerimeter() +
                           "\nCircle: area = " + circle.calculateArea() + ", perimeter = " + circle.calculatePerimeter() +
                           "\nRightTriangle: area = " + rightTriangle.calculateArea() + ", perimeter = " + rightTriangle.calculatePerimeter()
        );
    }
}
