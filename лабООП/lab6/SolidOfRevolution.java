package Lab06;

public class SolidOfRevolution extends  Shape {
    private double radius;
    public SolidOfRevolution(double radius){
        super(2);
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
}
