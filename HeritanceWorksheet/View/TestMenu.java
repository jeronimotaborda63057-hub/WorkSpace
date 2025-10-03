import java.io.Console;

public class TestMenu {

    public static void getStats(Shape shape) {
        System.out.println("\n - ID: " + shape.getId()
                + "\n - Coordenadas: (" + shape.getXcoordenate()
                + "," + shape.getYcoordenate() + ")" + "\n - Área: " + shape.area()
                + " cm2\n - Perímetro: "
                + shape.perimeter() + " cm");
    }

    public static void main(String[] args) {
        Console keyboard = System.console();

        String id;
        int option;
        double x, y, firstSide, secondSide, thirdSide, mayorAxis, minorAxis;
        boolean menu = true, condition;

        ShapeList shapes = new ShapeList();
        Square square;
        Rectangle rectangle;
        Circle circle;
        Oval oval;
        Triangle triangle;

        while (menu) {
            System.out.println(
                    "\n- - - - - - - - - - MENU DE FIGURAS - - - - - - - - - -\n- Ingrese una opción\n (1) Crear nueva figura\n (2) Mostrar lista de figuras\n (3) Consultar figura\n (4) Calcular área y perimetro de todas las figuras\n- Pulse otro número para salir del programa");
            try {
                option = Integer.parseInt(keyboard.readLine());
            } catch (Exception e) {
                option = -1;
            }
            switch (option) {
                case 1 -> {
                    System.out.println(
                            "Ingrese:\n (1) Crear cuadrado\n (2) Crear rectángulo\n (3) Crear círculo\n (4) Crear triángulo\n (5) Crear óvalo");
                    try {
                        option = Integer.parseInt(keyboard.readLine());
                    } catch (Exception e) {
                        option = -1;
                    }
                    switch (option) {
                        case 1 -> {
                            condition = false;
                            id = keyboard.readLine("\n- Ingrese el ID del cuadrado: ");
                            for (Shape shape : shapes.getShapeList()) {
                                if (shape.getId().equals(id)) {
                                    condition = true;
                                }
                            }
                            if (condition == true) {
                                System.out.println(
                                        "\n- Ya hay una figura existente con el mismo nombre. Volviendo al menú...");
                            } else {
                                x = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese la coordenada en el eje X del cuadrado: "));
                                y = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese la coordenada en el eje Y del cuadrado: "));
                                firstSide = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese el lado del cuadrado (cm): "));
                                shapes.addShape(new Square(id, x, y, firstSide));
                            }
                        }
                        case 2 -> {
                            condition = false;
                            id = keyboard.readLine("\n- Ingrese el ID del rectángulo: ");
                            for (Shape shape : shapes.getShapeList()) {
                                if (shape.getId().equals(id)) {
                                    condition = true;
                                }
                            }
                            if (condition == true) {
                                System.out.println(
                                        "\n- Ya hay una figura existente con el mismo nombre. Volviendo al menú...");
                            } else {
                                x = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese la coordenada en el eje X del rectángulo: "));
                                y = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese la coordenada en el eje Y del rectángulo: "));
                                firstSide = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese la base del rectángulo (cm): "));
                                secondSide = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese la altura del rectángulo: "));
                                shapes.addShape(new Rectangle(id, x, y, firstSide, secondSide));
                            }
                        }
                        case 3 -> {
                            condition = false;
                            id = keyboard.readLine("\n- Ingrese el ID del círculo: ");
                            for (Shape shape : shapes.getShapeList()) {
                                if (shape.getId().equals(id)) {
                                    condition = true;
                                }
                            }
                            if (condition == true) {
                                System.out.println(
                                        "\n- Ya hay una figura existente con el mismo nombre. Volviendo al menú...");
                            } else {
                                x = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese la coordenada en el eje X del círculo: "));
                                y = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese la coordenada en el eje Y del círculo: "));
                                mayorAxis = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese el radio del círculo (cm): "));
                                shapes.addShape(new Circle(id, x, y, mayorAxis));
                            }

                        }
                        case 4 -> {
                            condition = false;
                            id = keyboard.readLine("\n- Ingrese el ID del triángulo: ");
                            for (Shape shape : shapes.getShapeList()) {
                                if (shape.getId().equals(id)) {
                                    condition = true;
                                }
                            }
                            if (condition == true) {
                                System.out.println(
                                        "\n- Ya hay una figura existente con el mismo nombre. Volviendo al menú...");
                            } else {
                                x = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese la coordenada en el eje X del triángulo: "));
                                y = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese la coordenada en el eje Y del triángulo: "));
                                firstSide = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese el primer lado del triángulo (cm): "));
                                secondSide = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese el segundo lado del triángulo (cm): "));
                                thirdSide = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese el tercer lado del triángulo (cm): "));
                                triangle = new Triangle(id, x, y, firstSide, secondSide,
                                        thirdSide);
                                if (triangle.isValide(triangle)) {
                                    shapes.addShape(triangle);
                                } else {
                                    System.out.println("\n- Triángulo no válido. Volviendo al menú...");
                                }
                            }
                        }
                        case 5 -> {
                            condition = false;
                            id = keyboard.readLine("\n- Ingrese el ID del óvalo:");
                            for (Shape shape : shapes.getShapeList()) {
                                if (shape.getId().equals(id)) {
                                    condition = true;
                                }
                            }
                            if (condition == true) {
                                System.out.println(
                                        "\n- Ya hay una figura existente con el mismo nombre. Volviendo al menú...");
                            } else {
                                x = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese la coordenada en el eje X del óvalo: "));
                                y = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese la coordenada en el eje Y del óvalo: "));
                                mayorAxis = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese el eje mayor del óvalo (cm): "));
                                minorAxis = Double.parseDouble(keyboard.readLine(
                                        "\n- Ingrese el eje menor del óvalo (cm): "));
                                shapes.addShape(new Oval(id, x, y, minorAxis, mayorAxis));
                            }
                        }
                        default -> {
                            System.out.println(
                                    "\n- No ingresaste una opción válida. Volviendo al menú principal...");
                        }
                    }
                }
                case 2 -> {
                    // CONSULTAR LISTA
                    if (shapes.getShapeList().isEmpty()) {
                        System.out.println("\n - Error. Aún no has ingresado ninguna figura.");
                    } else {
                        for (Shape shape : shapes.getShapeList()) {
                            if (shape instanceof Square) {
                                square = (Square) shape;
                                System.out.println(
                                        "\n- CUADRADO:\n - Lado: " + square.getSide() + " cm");
                                getStats(shape);
                            } else if (shape instanceof Triangle) {
                                triangle = (Triangle) shape;
                                System.out.println("\n- TRIÁNGULO\n - Lado 1: "
                                        + triangle.getFirstSide()
                                        + " cm\n - Lado 2: "
                                        + triangle.getSecondSide()
                                        + " cm\n - Lado 3: "
                                        + triangle.getThirdSide() + " cm");
                                getStats(shape);
                            } else if (shape instanceof Circle) {
                                circle = (Circle) shape;
                                System.out.println("\n CÍRCULO:\n - Radio: " + circle.getRadius()
                                        + " cm");
                                getStats(shape);
                            } else if (shape instanceof Oval) {
                                oval = (Oval) shape;
                                System.out.println("\n ÓVALO\n - Eje mayor: "
                                        + oval.getMayorAxis()
                                        + " cm\n - Eje menor: "
                                        + oval.getMinorAxis() + " cm");
                                getStats(shape);
                            } else if (shape instanceof Rectangle) {
                                rectangle = (Rectangle) shape;
                                System.out.println("\n- REACTÁNGULO:\n - Base: " + rectangle.getBase()
                                        + " cm\n - Altura: "
                                        + rectangle.getHeight() + " cm");
                                getStats(shape);
                            }
                        }
                    }
                }
                case 3 -> {
                    // CONSULTAR FIGURA
                    if (shapes.getShapeList().isEmpty()) {
                        System.out.println("\n - Error. Aún no has ingresado ninguna figura.");
                    } else {
                        id = keyboard.readLine(
                                "\n- Ingrese el ID de la figura que quiere consultar: ");
                        for (Shape shape : shapes.getShapeList()) {
                            if (shape.getId().equals(id)) {
                                System.out.println("\n- Figura encontrada...");

                                if (shape instanceof Square) {
                                    square = (Square) shape;
                                    System.out.println(
                                            "\n- CUADRADO:\n - Lado: " + square.getSide() + " cm");
                                    getStats(shape);
                                } else if (shape instanceof Triangle) {
                                    triangle = (Triangle) shape;
                                    System.out.println("\n- TRIÁNGULO\n - Lado 1: "
                                            + triangle.getFirstSide()
                                            + " cm\n - Lado 2: "
                                            + triangle.getSecondSide()
                                            + " cm\n - Lado 3: "
                                            + triangle.getThirdSide() + " cm");
                                    getStats(shape);
                                } else if (shape instanceof Circle) {
                                    circle = (Circle) shape;
                                    System.out.println("\n CÍRCULO:\n - Radio: " + circle.getRadius()
                                            + " cm");
                                    getStats(shape);
                                } else if (shape instanceof Oval) {
                                    oval = (Oval) shape;
                                    System.out.println("\n ÓVALO\n - Eje mayor: "
                                            + oval.getMayorAxis()
                                            + " cm\n - Eje menor: "
                                            + oval.getMinorAxis() + " cm");
                                    getStats(shape);
                                } else if (shape instanceof Rectangle) {
                                    rectangle = (Rectangle) shape;
                                    System.out.println("\n- REACTÁNGULO:\n - Base: " + rectangle.getBase()
                                            + " cm\n - Altura: "
                                            + rectangle.getHeight() + " cm");
                                    getStats(shape);
                                }
                            } else {
                                System.out.println("\n- Figura no encontada... Volviendo al menú...");
                            }
                        }
                    }
                }
                case 4 -> {
                    if (shapes.getShapeList().isEmpty()) {
                        System.out.println("\n - Error. Aún no has ingresado ninguna figura.");
                    } else {
                        System.out.println("\n- El área total de todas las figuras es: "
                                + shapes.getShapesTotalArea()
                                + " cm2\n- El perímetro total de todas las figuras es: "
                                + shapes.getShapesTotalPerimeter() + " cm");
                    }
                }
                default -> {
                    menu = false;
                }
            }
        }
    }
}