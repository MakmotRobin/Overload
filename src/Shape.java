public class Shape {
    private String shapeName;
    private int numberOfEdges;

    public Shape() {
        System.out.println("Creating a Shape object.");
        shapeName = "Undefined shape";
    }

    public Shape(double radius) {
        System.out.println("Creating a Circle object.");
        shapeName = "Circle";
        numberOfEdges = 0; // Circle has no edges
    }

    public Shape(int edges, double edgeLength) {
        System.out.println("Creating a Square object.");
        shapeName = "Square";
        numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2) {
        System.out.println("Creating a Rectangle object.");
        shapeName = "Rectangle";
        numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2, double e3) {
        System.out.println("Creating a Triangle object.");
        shapeName = "Triangle";
        numberOfEdges = edges;
    }

    public String getShapeDetails() {
        return "Shape Name: " + shapeName + "\nNumber of Edges: " + numberOfEdges;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Shape(5.0);
        Shape square = new Shape(4, 10.0);
        Shape rectangle = new Shape(4, 5.0, 8.0);
        Shape triangle = new Shape(3, 3.0, 4.0, 5.0);
        Shape undefinedShape = new Shape();

        String circleDetails = circle.getShapeDetails();
        String squareDetails = square.getShapeDetails();
        String rectangleDetails = rectangle.getShapeDetails();
        String triangleDetails = triangle.getShapeDetails();
        String undefinedShapeDetails = undefinedShape.getShapeDetails();

        System.out.println("Circle Details:\n" + circleDetails);
        System.out.println("Square Details:\n" + squareDetails);
        System.out.println("Rectangle Details:\n" + rectangleDetails);
        System.out.println("Triangle Details:\n" + triangleDetails);
        System.out.println("Undefined Shape Details:\n" + undefinedShapeDetails);
    }
}