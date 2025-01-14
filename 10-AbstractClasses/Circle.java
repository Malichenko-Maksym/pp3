public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return 2 * Math.PI * radius;
    }

}
