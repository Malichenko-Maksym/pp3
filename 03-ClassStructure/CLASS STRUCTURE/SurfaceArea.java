
public class SurfaceArea
{
    
    public static double Circle Area(double radius)
    {
        return Math.PI*Math.pow(radius,2);
    }
    
    
    public static double Rectangle  Area(double side1, double side2)
    {
        return side1*side2;
    }
    
    
    public static double Triangle  Area(double heigth, double sideToHeigth)
    {
        return heigth*sideToHeigth*0.5;
    }
    
    
    public static void main(String[] args) {
        System.out.println("Circle Area: "+SurfaceArea.Circle Area(3));
        System.out.println("Rectangle Area: "+SurfaceArea.RectangleArea(4,5));
        System.out.println("Triangle  Area: "+SurfaceArea.Triangle Area(4,3));
    }    
}
