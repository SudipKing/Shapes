package shapes;

import java.util.Locale;

/**
 * Represents an abstract base class for all shape types.
 * Includes area calculation, name retrieval, comparison, 
 * and equality checking. Subclasses must
 * implement the {@link #area()} method.
 */
public abstract class AbstractShape implements Comparable<AbstractShape> {

    /**
     * Returns the computed area of the shape.
     * @return the area value of this shape
     */
    public abstract double area();

    /**
     * Returns the name of this shape.
     * @return the shape name as a string
     */
    public String name() {
        return getClass().getSimpleName();
    }

    /**
     * Returns a string describing this shape, including
     * its name and area.
     * @return a formatted string with shape details
     */
    @Override
    public final String toString() {
        return String.format(Locale.US, "Name: %s, Area: %.2f", name(), area());
    }

    /**
     * Compares this shape with another for sorting or ordering.
     * Comparison is based on the name first, and then by area
     * if the names are equal.
     * @param theOther the other shape to compare against
     * @return a negative, zero, or positive integer result
     */
    @Override
    public int compareTo(final AbstractShape theOther) {
        final int nameCmp = name().compareTo(theOther.name());
        if (nameCmp != 0) {
            return nameCmp;
        }
        return Double.compare(area(), theOther.area());
    }

    /**
     * Tests whether this shape is equal to another object.
     * Equality is based on having the same class type and equal
     * name and area values.
     * @param theOtherObject the object to test for equality
     * @return {@code true} if equal, {@code false} otherwise
     */
    @Override
    public boolean equals(final Object theOtherObject) {
        if (this == theOtherObject) {
            return true;
        }
        if (theOtherObject == null) {
            return false;
        }
        if (getClass() != theOtherObject.getClass()) {
            return false;
        }
        return compareTo((AbstractShape) theOtherObject) == 0;
    }
}