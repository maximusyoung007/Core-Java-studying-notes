package Chapter9;

public class Exercise_01 {
   public static void main(String[] args){
       Rectangle r1 = new Rectangle(4,40);
       System.out.println("the width of r1 is " + r1.width + " and the height of r1 is " + r1.height);
       System.out.println("the area of r1 is " + r1.getArea());
       System.out.println("the perimeter of r1 is " + r1.perimeter());
       Rectangle r2 = new Rectangle(3.5,35.9);
       System.out.println("the width of r2 is " + r2.width + " and the height of r2 is " + r2.height);
       System.out.println("the area of r2 is " + r2.getArea());
       System.out.println("the perimeter of r2 is " + r2.perimeter());
   }
}
class Rectangle{
    double width = 1,height = 1;
    Rectangle(){
    }
    Rectangle(double newWidth,double newHeight){
        width = newWidth;
        height = newHeight;
    }
    double getArea(){
        return width * height;
    }
    double perimeter(){
        return 2 * (width + height);
    }
}
