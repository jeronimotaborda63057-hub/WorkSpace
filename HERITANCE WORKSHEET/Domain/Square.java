public class Square extends Shape {
    private double firstSide;

    public Square(String id, double xCoord, double yCoord, double firstSide) {
        super(id, xCoord, yCoord);
        setSide(firstSide);
    }

    @Override
    public double area() {
        if (firstSide > 0) {
            return Math.pow(firstSide, 2);
        }
        return 0;
    }

    @Override
    public double perimeter() {
        if (firstSide > 0) {
            return 4 * firstSide;
        }
        return 0;
    }

    
    public void setSide(double firstSide) {
        if (firstSide > 0) {
            this.firstSide = firstSide;
        }else{
            this.firstSide = 0;
        }
    }
    
    public double getSide() {
        return firstSide;
    }
}
