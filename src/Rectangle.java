public class Rectangle extends Shape{

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double perimeter() {
        return 2 * (getA() + getB());
    }
}
