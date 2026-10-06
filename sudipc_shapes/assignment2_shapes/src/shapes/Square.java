package shapes;

/**
 * Represents a square defined by its side length.
 */
public final class Square extends AbstractShape {

    private final double side;

    /**
     * Constructs a square with the given side length.
     * @param theSide the side length
     * @throws IllegalArgumentException if the side is non-positive
     */
    Square(final double theSide) {
        if (theSide <= 0.0) {
            throw new IllegalArgumentException("side must be > 0, was " + theSide);
        }
        side = theSide;
    }

    /**
     * Returns the side length of this square.
     * @return the side value
     */
    public double getSide() {
        return side;
    }

    /**
     * Computes and returns the area of this square.
     * @return the calculated area
     */
    @Override
    public double area() {
        return side * side;
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