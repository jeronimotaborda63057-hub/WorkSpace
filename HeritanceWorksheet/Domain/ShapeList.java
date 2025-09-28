import java.util.ArrayList;
import java.util.List;

public class ShapeList {
    private List<Shape> shapes;

    public ShapeList() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapeList() {
        return shapes;
    }

    public double getShapesTotalArea() {
        double add = 0;
        for (Shape shape : shapes) {
            add += shape.area();
        }
        return add;
    }

    public double getShapesTotalPerimeter(){
        double add = 0;
        for(Shape shape : shapes){
            add += shape.perimeter();
        }
        return add;
    }

}
