package Lab05;

public class TrapezoidArea {

    public double getTrapezoidArea(double base1,double base2,double height){
        Trapezoid trapezoid = new Trapezoid(base1, base2, height);
        double area = trapezoid.getArea();
        return area;
    }
}
class Trapezoid{

    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double base1, double base2, double height){
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }
    public double getArea(){
        double area = (((base1 + base2)/2 ) * height);
        return area;
    }
}