package controller;
import shapes.AbstractShape;
import shapes.ShapeFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A driver class that demonstrates the creation, display,
 * and sorting of various shape objects.
 */
public final class ShapeTester {

    /**
     * Creates a list of different shapes, displays them before
     * and after sorting, and prints the shape details.
     */
    public static void main(final String[] args) {
        final List<AbstractShape> shapes = new ArrayList<>();

        shapes.add(ShapeFactory.createCircle(1.0));
        shapes.add(ShapeFactory.createCircle(2.0));
        shapes.add(ShapeFactory.createCircle(3.0));
        shapes.add(ShapeFactory.createCircle(2.0));
        shapes.add(ShapeFactory.createCircle(4.0));

        shapes.add(ShapeFactory.createSquare(1.5));
        shapes.add(ShapeFactory.createSquare(2.5));
        shapes.add(ShapeFactory.createSquare(3.5));
        shapes.add(ShapeFactory.createSquare(3.5));
        shapes.add(ShapeFactory.createSquare(4.5));

        shapes.add(ShapeFactory.createTriangle(3.0, 4.0));
        shapes.add(ShapeFactory.createTriangle(5.0, 2.0));
        shapes.add(ShapeFactory.createTriangle(3.0, 4.0));
        shapes.add(ShapeFactory.createTriangle(6.0, 7.0));
        shapes.add(ShapeFactory.createTriangle(8.0, 3.0));

        shapes.add(ShapeFactory.createRectangle(2.0, 3.0));
        shapes.add(ShapeFactory.createRectangle(4.0, 5.0));
        shapes.add(ShapeFactory.createRectangle(2.0, 3.0));
        shapes.add(ShapeFactory.createRectangle(6.0, 2.0));
        shapes.add(ShapeFactory.createRectangle(3.0, 3.0));

        System.out.println("Shapes before sorting:");
        printShapes(shapes);

        Collections.sort(shapes);

        System.out.println("\nShapes after sorting:");
        printShapes(shapes);
    }

    /**
     * Prints the details of all shapes in a given list.
     * @param theShapes the list of shapes to print
     */
    private static void printShapes(final List<AbstractShape> theShapes) {
        for (int i = 0; i < theShapes.size(); i++) {
            System.out.printf("%2d. %s%n", i + 1, theShapes.get(i).toString());
        }
    }
}