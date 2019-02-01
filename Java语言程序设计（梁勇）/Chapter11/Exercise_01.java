package Chapter11;
import java.util.Date;
import java.util.Scanner;
class GeomertricObject {
    private String color = null;
    private boolean filled = false;
    private Date datacreated;
    GeomertricObject() {
        datacreated = new Date();
    }
    GeomertricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        datacreated = new Date();
    }
    public boolean isFilled() {
        if (this.color != null) filled = true;
        return filled;
    }
    public void setcolor(String color) {
        this.color = color;
    }
    public String getcolor() {
        return color;
    }
    public java.util.Date getDataCreated() {
        return datacreated;
    }
}
class Triangle extends GeomertricObject{
    private double side1 = 1,side2 = 1,side3 = 1;
    Triangle() {
    }
    Triangle(double side1,double side2,double side3){
        super.getDataCreated();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    double getside1() {
        return side1;
    }
    void setside1(double side1) {
        this.side1 = side1;
    }
    double getside2() {
        return side2;
    }
    void setside2(double side2) {
        this.side1 = side2;
    }
    double getside3() {
        return side3;
    }
    void setside3(double side3) {
        this.side3 = side3;
    }
    double getPerimeter() {
        return side1 + side2 + side3;
    }
    String getArea() {
        double s = (side1+side2+side3)/2;
        s = Math.sqrt(s);
        String result = String .format("%.2f",s);
        return result;
    }
    @Override
    public String toString(){
        return ("Triangle:side1 = " + side1 +"side2 = " + side2 +"side3 = " + side3);
    }
}
public class Exercise_01{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter three sides of triangle:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        Triangle triangle = new Triangle(side1,side2,side3);
        //System.out.print("enter the color of triangle:");
        //String color = input.nextLine();
        String color = "yellow";
        triangle.setcolor(color);
        System.out.println("area： " + triangle.getArea() + " perimeter： " + triangle.getPerimeter());
        System.out.println("three sides： " + triangle.getside1()+" "+ triangle.getside2() + " "+ triangle.getside3());
        System.out.println("whether filled with color " + triangle.isFilled()+"\ncolor is： "+ triangle.getcolor());
        System.out.println("Created data：" + triangle.getDataCreated());
    }
}
