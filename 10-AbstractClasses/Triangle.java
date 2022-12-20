public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        // √[s(s – a)(s – b)(s – c)]
        double sP = perimeter() / 2;
        return Math.sqrt(sP * (sP - a) * (sP - b) * (sP - c));
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return a + b + c;
    }

}
