package Chapter10;

public class Exercise_04 {
    public static void main(String[] args){
        Mypoint p1 = new Mypoint();
        Mypoint p2 = new Mypoint(10,30.5);
        System.out.println("the distance1:" + p1.distance(p2));
        System.out.println("the distance2:" + Mypoint.distance(p1,p2));
    }
}
class Mypoint{
    private double x,y;
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    Mypoint(){
    }
    Mypoint(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double distance(Mypoint secondPoint) {
        return distance(this, secondPoint);
    }

    public static double distance(Mypoint p1, Mypoint p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y)
                * (p1.y - p2.y));
    }
}
