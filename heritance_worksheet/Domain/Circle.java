public class Circle extends Shape {
    private double radius;

    public Circle(String id, double xCoord, double yCoord, double radius) {
        super(id, xCoord, yCoord);
        setRadius(radius);
    }
    
    @Override
    public double area() {
        if (radius > 0) {
            return Math.PI * Math.pow(radius, 2);
        }
        return 0;
    }

    @Override
    public double perimeter() {
        if (radius > 0) {
            return Math.PI * 2 * radius;
        }
        return 0;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }else{
            this.radius = 0;
        }
    }

    public double getRadius() {
        return radius;
    }

}
