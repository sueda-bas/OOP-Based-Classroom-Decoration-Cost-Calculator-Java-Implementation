/**
 * The Circle class is a subclass derived from the Classroom class.
 * This class represents a circular classroom and contains specialized methods for calculating wall area and floor area.
 */
public class Circle extends Classroom{
    /**
     * Calculates the wall area of the circular classroom.
     *
     * @param width  The width (diameter) of the classroom
     * @param length The length of the classroom (ignored)
     * @param height The height of the classroom
     * @return The calculated wall area
     */
    @Override
    public double calculateWallArea(double width, double length, double height) {
        return Math.PI * width  * height;
    }
    /**
     * Calculates the floor area of the circular classroom.
     *
     * @param width  The width (diameter) of the classroom
     * @param length The length of the classroom (ignored)
     * @return The calculated floor area
     */
    @Override
    public double calculateFloorArea(double width, double length) {
        return Math.PI * width * length / 4;
    }
}
