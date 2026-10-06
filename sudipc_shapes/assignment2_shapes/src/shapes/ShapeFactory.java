package shapes;

/**
 * A factory class for creating shape objects.
 * Provides static methods to create instances of various shape types.
 * This class cannot be instantiated.
 */
public final class ShapeFactory {

    /**
     * Private constructor to prevent instantiation.
     * @throws AssertionError always, since instantiation is not allowed
     */
    private ShapeFactory() {
        throw new AssertionError("no instantiation");
    }

    /**
     * Creates a circle with the specified radius.
     * @param theRadius the radius of the circle
     * @return a new {@link Circle} instance
     */
    public static Circle createCircle(final double theRadius) {
        return new Circle(theRadius);
    }

    /**
     * Creates a square with the specified side length.
     * @param theSide the side length of the square
     * @return a new {@link Square} instance
     */
    public static Square createSquare(final double theSide) {
        return new Square(theSide);
    }

    /**
     * Creates a triangle with the specified base and height.
     * @param theBase   the base length of the triangle
     * @param theHeight the height of the triangle
     * @return a new {@link Triangle} instance
     */
    public static Triangle createTriangle(final double theBase,
                                          final double theHeight) {
        return new Triangle(theBase, theHeight);
    }

    /**
     * Creates a rectangle with the specified length and width.
     * @param theLength the length of the rectangle
     * @param theWidth  the width of the rectangle
     * @return a new {@link Rectangle} instance
     */
    public static Rectangle createRectangle(final double theLength,
                                            final double theWidth) {
        return new Rectangle(theLength, theWidth);
    }
}