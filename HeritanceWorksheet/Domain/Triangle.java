public class Triangle extends Rectangle {
    private double thirdSide;

    public Triangle(String id, double xCoord, double yCoord, double firstSide, double secondSide, double thirdSide) {
        super(id, xCoord, yCoord, firstSide, secondSide);
        setThirdSide(thirdSide);
    }

    @Override
    public double area() {
        if (getFirstSide() > 0 && getSecondSide() > 0 && thirdSide > 0) {
            double s = perimeter() / 2;
            return Math.sqrt(s * (s - getFirstSide()) * (s - getSecondSide()) * (s - thirdSide));
        }
        return 0;
    }

    @Override
    public double perimeter() {
        if (getFirstSide() > 0 && getSecondSide() > 0 && thirdSide > 0) {
            return getFirstSide() + getSecondSide() + thirdSide;
        }
        return 0;
    }

    public void setThirdSide(double thirdSide) {
        if (thirdSide > 0) {
            this.thirdSide = thirdSide;
        }else{
            this.thirdSide = 0;
        }
    }

    public double getFirstSide() {
        return getSide();
    }

    public double getSecondSide() {
        return getHeight();
    }

    public double getThirdSide() {
        return thirdSide;
    }

}
