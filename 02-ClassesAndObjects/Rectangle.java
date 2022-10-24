
public class Rectangle {
   int height;
   int weigth;

    Rectangle(int heht, int weth) {
        height = heht;
        weigth = weth;
    }
    public void DisplayDimension() {
        System.out.println(height+"x"+weigth);
    }
    public void Perimeter() {
        int perimeter = 2* (height+weigth);
        System.out.println(perimeter);
    }
    public void SurfaceArea() {
        int surfaceArea = height * weigth;
      System.out.println(surfaceArea);
    }
  
    public static void main(String[] args) {
        Rectangle l1 = new Rectangle(3,4);
        Rectangle l2 = new Rectangle(2,10);
        l1.DisplayDimension();
        l2.DisplayDimension();
        l1.Perimeter();
        l2.SurfaceArea();
    }

  }