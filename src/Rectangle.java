/**
 * The Rectangle class is a subclass derived from the Classroom class.
 * This class represents a rectangular classroom and inherits methods for calculating wall area and floor area from its superclass.
 */
public class Rectangle extends Classroom {
        /**
         * Calculates the wall area of the rectangular classroom.
         *
         * @param width  The width of the classroom
         * @param length The length of the classroom
         * @param height The height of the classroom
         * @return The calculated wall area
         */
        @Override
        public double calculateWallArea(double width, double length, double height) {
                return super.calculateWallArea(width, length, height);
        }

        /**
         * Calculates the floor area of the rectangular classroom.
         *
         * @param width  The width of the classroom
         * @param length The length of the classroom
         * @return The calculated floor area
         */
        @Override
        public double calculateFloorArea(double width, double length) {
                return super.calculateFloorArea(width, length);
        }
}


