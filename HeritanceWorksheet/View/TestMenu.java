import java.io.Console;

public class TestMenu {
    public static void main(String[] args) {
        Console keyboard = System.console();

        String id;
        int option, optionShape;
        double x, y, firstSide, secondSide, thirdSide, mayorAxis, minorAxis;
        boolean menu = true;

        ShapeList shapes = new ShapeList();
        Square square;
        Rectangle rectangle;
        Circle circle;
        Oval oval;
        Triangle triangle;

        while (menu) {
            System.out.println(
                    "\n- - - - - - - - - - MENU DE FIGURAS - - - - - - - - - -\n- Ingrese una opción\n (1) Crear nueva figura\n (2) Mostrar lista de figuras\n (3) Consultar figura\n (4) Calcular área y perimetro de todas las figuras\n- Pulse otro número para salir del programa");
            option = Integer.parseInt(keyboard.readLine());
            switch (option) {
                case 1 -> {
                    System.out.println(
                            "Ingrese:\n (1) Crear cuadrado\n (2) Crear rectángulo\n (3) Crear círculo\n (4) Crear triángulo\n (5) Crear óvalo");
                    optionShape = Integer.parseInt(keyboard.readLine());
                    switch (optionShape) {
                        case 1 -> {
                            id = keyboard.readLine("\n- Ingrese el ID del cuadrado: ");
                            x = Double.parseDouble(keyboard.readLine(
                                    "\n- Ingrese la coordenada en el eje X del cuadrado: "));
                            y = Double.parseDouble(keyboard.readLine(
                                    "\n- Ingrese la coordenada en el eje Y del cuadrado: "));
                            firstSide = Double.parseDouble(keyboard.readLine(
                                    "\n- Ingrese el lado del cuadrado (cm): "));
                            shapes.addShape(new Square(id, x, y, firstSide));
                        }
                        case 2 -> {
                            id = keyboard.readLine("\n- Ingrese el ID del rectángulo: ");
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
                        case 3 -> {
                            id = keyboard.readLine("\n- Ingrese el ID del círculo: ");
                            x = Double.parseDouble(keyboard.readLine(
                                    "\n- Ingrese la coordenada en el eje X del círculo: "));
                            y = Double.parseDouble(keyboard.readLine(
                                    "\n- Ingrese la coordenada en el eje Y del círculo: "));
                            mayorAxis = Double.parseDouble(keyboard.readLine(
                                    "\n- Ingrese el radio del círculo (cm): "));
                            shapes.addShape(new Circle(id, x, y, mayorAxis));

                        }
                        case 4 -> {
                            // TRIANGLE
                            id = keyboard.readLine("\n- Ingrese el ID del triángulo: ");
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
                            shapes.addShape(new Triangle(id, x, y, firstSide, secondSide,
                                    thirdSide));

                        }
                        case 5 -> {
                            // OVAL
                            id = keyboard.readLine("\n- Ingrese el ID del óvalo:");
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
                                System.out.println("\n- CUADRADO:");
                            } else if (shape instanceof Triangle) {
                                System.out.println("\n- TRIÁNGULO: ");
                            } else if (shape instanceof Circle) {
                                System.out.println("\n- CÍRCULO: ");
                            } else if (shape instanceof Oval) {
                                System.out.println("\n- ÓVALO: ");
                            } else if (shape instanceof Rectangle) {
                                System.out.println("\n- RECTÁNGULO: ");
                            }
                            System.out.println("\n - ID: " + shape.getId()
                                    + "\n - Coordenadas: (" + shape.getXcoordenate()
                                    + "," + shape.getYcoordenate() + ")");
                            if (shape instanceof Square) {
                                square = (Square) shape;
                                System.out.println(
                                        " - Lado: " + square.getSide() + " cm");
                            } else if (shape instanceof Rectangle) {
                                rectangle = (Rectangle) shape;
                                System.out.println(" - Base: " + rectangle.getBase()
                                        + " cm\n - Altura: "
                                        + rectangle.getHeight() + " cm");
                            } else if (shape instanceof Circle) {
                                circle = (Circle) shape;
                                System.out.println(" - Radio: " + circle.getRadius()
                                        + " cm");
                            } else if (shape instanceof Triangle) {
                                triangle = (Triangle) shape;
                                System.out.println(" - Lado 1: "
                                        + triangle.getFirstSide()
                                        + " cm\n - Lado 2: "
                                        + triangle.getSecondSide()
                                        + " cm\n - Lado 3: "
                                        + triangle.getThirdSide() + " cm");
                            } else if (shape instanceof Oval) {
                                oval = (Oval) shape;
                                System.out.println(" - Eje mayor: "
                                        + oval.getMayorAxis()
                                        + " cm\n - Eje menor: "
                                        + oval.getMinorAxis() + " cm");
                            }
                            System.out.println(
                                    " - Área: " + shape.area()
                                            + " cm2\n - Perímetro: "
                                            + shape.perimeter() + " cm");
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
                                    System.out.println("\n- CUADRADO:");
                                } else if (shape instanceof Triangle) {
                                    System.out.println("\n- TRIÁNGULO: ");
                                } else if (shape instanceof Circle) {
                                    System.out.println("\n- CÍRCULO: ");
                                } else if (shape instanceof Oval) {
                                    System.out.println("\n- ÓVALO: ");
                                } else if (shape instanceof Rectangle) {
                                    System.out.println("\n- RECTÁNGULO: ");
                                }
                                System.out.println("\n - ID: " + shape.getId()
                                        + "\n - Coordenadas: ("
                                        + shape.getXcoordenate()
                                        + "," + shape.getYcoordenate() + ")");
                                if (shape instanceof Square) {
                                    square = (Square) shape;
                                    System.out.println(
                                            " - Lado: " + square.getSide()
                                                    + " cm");
                                } else if (shape instanceof Rectangle) {
                                    rectangle = (Rectangle) shape;
                                    System.out.println(" - Base: "
                                            + rectangle.getBase()
                                            + " cm\n - Altura: "
                                            + rectangle.getHeight()
                                            + " cm");
                                } else if (shape instanceof Circle) {
                                    circle = (Circle) shape;
                                    System.out.println(" - Radio: "
                                            + circle.getRadius()
                                            + " cm");
                                } else if (shape instanceof Triangle) {
                                    triangle = (Triangle) shape;
                                    System.out.println(" - Lado 1: "
                                            + triangle.getFirstSide()
                                            + " cm\n - Lado 2: "
                                            + triangle.getSecondSide()
                                            + " cm\n - Lado 3: "
                                            + triangle.getThirdSide()
                                            + " cm");
                                } else if (shape instanceof Oval) {
                                    oval = (Oval) shape;
                                    System.out.println(" - Eje mayor: "
                                            + oval.getMayorAxis()
                                            + " cm\n - Eje menor: "
                                            + oval.getMinorAxis() + " cm");
                                }
                            } else {
                                System.out.println("\n- Figura no encontada... Volviendo al menú...");
                            }
                            System.out.println(
                                    " - Área: " + shape.area()
                                            + " cm2\n - Perímetro: "
                                            + shape.perimeter() + " cm");
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