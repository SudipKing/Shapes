package shapes;

/**
 * Represents a circle defined by its radius.
 */
public final class Circle extends AbstractShape {

    private final double radius;

    /**
     * Constructs a Circle with a given radius.
     * @param radius the radius of the circle 
     */
    public Circle(double radius) {
        this.radius = radius > 0 ? radius : 0;
    }

    /**
     * Returns the area of the circle.
     * @return the calculated area
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     * Returns the radius of the circle.
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
}