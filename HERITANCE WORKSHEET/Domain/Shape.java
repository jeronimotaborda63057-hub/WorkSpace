public abstract class Shape {
    private String id;
    private double xCoord;
    private double yCoord;

    public Shape(String id, double xCoord, double yCoord) {
        this.id = id;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public abstract double area();

    public abstract double perimeter();

    public void setId(String id) {
        this.id = id;
    }

    public void setXcoordenate(double xCoord) {
        this.xCoord = xCoord;
    }

    public void setYcoordenate(double yCoord) {
        this.yCoord = yCoord;
    }

    public double getXcoordenate() {
        return xCoord;
    }

    public double getYcoordenate() {
        return yCoord;
    }

    public String getId() {
        return id;
    }

}