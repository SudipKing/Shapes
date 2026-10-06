package shapes;

/**
 * Represents a rectangle defined by its length and width.
 */
public final class Rectangle extends AbstractShape {

    private final double length;
    private final double width;

    /**
     * Constructs a rectangle with the given dimensions.
     * @param theLength the rectangle's length 
     * @param theWidth  the rectangle's width 
     * @throws IllegalArgumentException if any dimension is non-positive
     */
    Rectangle(final double theLength, final double theWidth) {
        if (theLength <= 0.0) {
            throw new IllegalArgumentException("length must be > 0, was " + theLength);
        }
        if (theWidth <= 0.0) {
            throw new IllegalArgumentException("width must be > 0, was " + theWidth);
        }
        length = theLength;
        width = theWidth;
    }

    /**
     * Returns the rectangle's length.
     * @return the length value
     */
    public double getLength() {
        return length;
    }

    /**
     * Returns the rectangle's width.
     * @return the width value
     */
    public double getWidth() {
        return width;
    }

    /**
     * Computes and returns the rectangle's area.
     * @return the calculated area
     */
    @Override
    public double area() {
        return length * width;
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