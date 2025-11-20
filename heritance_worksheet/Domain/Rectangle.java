public class Rectangle extends Square {
    private double secondSide;

    public Rectangle(String id, double xCoord, double yCoord, double firstSide, double secondSide) {
        super(id, xCoord, yCoord, firstSide);
        setHeight(secondSide);
    }

    @Override
    public double area() {
        if (getSide() > 0 && secondSide > 0) {
            return getSide() * secondSide;
        }
        return 0;
    }

    @Override
    public double perimeter() {
        if (getSide() > 0 && secondSide > 0) {
            return (2 * getSide()) + (2 * secondSide);
        }
        return 0;
    }

    public void setHeight(double secondSide) {
        if (secondSide > 0) {
            this.secondSide = secondSide;
        } else {
            this.secondSide = 0;
        }
    }

    public double getBase() {
        return getSide();
    }

    public double getHeight() {
        return secondSide;
    }
}
