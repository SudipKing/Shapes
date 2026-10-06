package shapes;

/**
 * Represents a triangle defined by its base and height.
 */
public final class Triangle extends AbstractShape {

    private final double base;
    private final double height;

    /**
     * Constructs a triangle with the specified base and height.
     * @param theBase   the base length 
     * @param theHeight the height value 
     * @throws IllegalArgumentException if any dimension is non-positive
     */
     
    Triangle(final double theBase, final double theHeight) {
        if (theBase <= 0.0) {
            throw new IllegalArgumentException("base must be > 0, was " + theBase);
        }
        if (theHeight <= 0.0) {
            throw new IllegalArgumentException("height must be > 0, was " + theHeight);
        }
        base = theBase;
        height = theHeight;
    }

    /**
     * Returns the base length of the triangle.
     * @return the base value
     */
    public double getBase() {
        return base;
    }

    /**
     * Returns the height of the triangle.
     * @return the height value
     */
    public double getHeight() {
        return height;
    }

    /**
     * Computes and returns the area of the triangle.
     * @return the calculated area
     */
    @Override
    public double area() {
        return 0.5 * base * height;
    }

    /**
     * Returns a hash code based on the class and area.
     * @return the hash code
     */
    @Override
    public final int hashCode() {
        return getClass().hashCode() * 31 + Double.hashCode(area());
    }
}