public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        Triangle t1 = new Triangle(3.0, 4.0, 5.0);
        System.out.println(t1.area());
        System.out.println(t1.perimeter());
        Rectangle r1 = new Rectangle(6, 7);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
