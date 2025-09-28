public class Oval extends Circle {
    private double mayorAxis;

    public Oval(String id, double xCoord, double yCoord, double menorAxis, double mayorAxis) {
        super(id, xCoord, yCoord, menorAxis);
        setMayorAxis(mayorAxis);
    }

    @Override
    public double area() {
        if (mayorAxis > 0 && getMinorAxis() > 0) {
            return Math.PI * mayorAxis * getMinorAxis();
        }
        return 0;
    }

    @Override
    public double perimeter() {
        if (mayorAxis > 0 && getMinorAxis() > 0) {
            return Math.PI * ((3 * (mayorAxis + getMinorAxis()) - Math.sqrt(((3 * mayorAxis) + getMinorAxis()) * (mayorAxis + (3 * getMinorAxis())))));
        }
        return 0;
    }

    public void setMayorAxis(double mayorAxis) {
        if (mayorAxis > 0) {
            this.mayorAxis = mayorAxis;
        } else {
            this.mayorAxis = 0;
        }
    }

    public double getMinorAxis() {
        return getRadius();
    }

    public double getMayorAxis() {
        return mayorAxis;
    }
}
