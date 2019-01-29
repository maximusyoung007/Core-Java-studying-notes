package Chapter10;
public class Exercise_11 {
    public static void main(String[] args){
        Circle2D circle1 = new Circle2D(2,2,2.5);
        System.out.println("area is : " + circle1.getArea() + " perimeter is :" + circle1.getPerimeter());
        System.out.println(circle1.contains(3,3));
        Circle2D circle2 = new Circle2D(4,5,10.5);
        System.out.println( circle1.contains(circle2));
        System.out.println(circle1.overlaps(new Circle2D(3,5,2.3)));
    }
}
class Circle2D{
    private double x,y;
    private double radius;
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }
    Circle2D(){
        x = 0;
        y = 0;
        radius = 1;
    }
    Circle2D(double x,double y,double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public boolean contains(double x,double y){
        if(Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y,2)) >= radius)
            return false;
        return true;
    }
    public boolean contains(Circle2D circle){
        if(Math.sqrt(Math.pow(circle.x - this.x,2) + Math.pow(circle.y - this.y,2)) >= radius)
            return false;
        return true;
    }
    public boolean overlaps(Circle2D circle){
        if(Math.sqrt(Math.pow(circle.x - this.x,2) + Math.pow(circle.y - this.y,2)) >= radius + circle.radius)
            return false;
        return true;
    }
}
