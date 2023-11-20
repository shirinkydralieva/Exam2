package task3;

public class RightTriangle extends Shape {
    /*
    Так как есть много формул для разных треугольников, я решила взять прямоугольный треугольник.
     */
    private Double leg1; // leg - катет(сторона прямоугольного треугольника)
    private Double leg2;
    private Double hypotenuse;// гипотенуза

    public RightTriangle() {
    }

    public RightTriangle(Double leg1, Double leg2, Double hypotenuse) {
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public Double calculateArea() {
        return 0.5 * leg1 * leg2;
    }

    @Override
    public Double calculatePerimeter() {
        return leg1 + leg2 + hypotenuse;
    }

    //Если вы хотите использовать сеттеры и геттеры для установки значения.
    public Double getLeg1() {
        return leg1;
    }

    public void setLeg1(Double leg1) {
        this.leg1 = leg1;
    }

    public Double getLeg2() {
        return leg2;
    }

    public void setLeg2(Double leg2) {
        this.leg2 = leg2;
    }

    public Double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(Double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }
}
