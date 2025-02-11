/**
 * The Classroom class represents a generic classroom with properties such as name, width, length, and height.
 */
public class Classroom {
    private String name;
    private double width;
    private double length;
    private double height;


    public void setName(String name) {
        this.name = name;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }


    /**
     * Calculates the wall area of the classroom.
     *
     * @param width  The width of the classroom
     * @param length The length of the classroom
     * @param height The height of the classroom
     * @return The calculated wall area
     */
    public double calculateWallArea(double width, double length, double height){
        return 2 * (width + length) * height;
    }
    /**
     * Calculates the floor area of the classroom.
     *
     * @param width  The width of the classroom
     * @param length The length of the classroom
     * @return The calculated floor area
     */
    public double calculateFloorArea(double width, double length){
        return width * length;
    }
}
