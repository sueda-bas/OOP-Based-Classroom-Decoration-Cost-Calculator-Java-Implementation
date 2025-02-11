/**
 * The ClassroomBuilder class is responsible for constructing instances of Classroom.
 * It provides methods to set properties such as name, width, length, and height, and builds the classroom object.
 */
public class ClassroomBuilder {
    private Classroom classroom;

    /**
     * Constructs a new ClassroomBuilder instance based on the specified shape.
     *
     * @param shape The shape of the classroom ("Circle" or "Rectangle")
     */
    public ClassroomBuilder(String shape){
        switch (shape){
            case "Circle" :
                this.classroom = new Circle();
                break;
            case "Rectangle":
                this.classroom = new Rectangle();
                break;
        }
    }
    /**
     * Sets the name of the classroom.
     *
     * @param name The name of the classroom
     * @return The ClassroomBuilder instance
     */
    public ClassroomBuilder setName(String name){
        this.classroom.setName(name);
        return this;
    }
    /**
     * Sets the width of the classroom.
     *
     * @param width The width of the classroom
     * @return The ClassroomBuilder instance
     */
    public ClassroomBuilder setWidth(double width){
        this.classroom.setWidth(width);
        return this;
    }
    /**
     * Sets the length of the classroom.
     *
     * @param length The length of the classroom
     * @return The ClassroomBuilder instance
     */
    public ClassroomBuilder setLength(double length){
        this.classroom.setLength(length);
        return this;
    }
    /**
     * Sets the height of the classroom.
     *
     * @param height The height of the classroom
     * @return The ClassroomBuilder instance
     */
    public ClassroomBuilder setHeight(double height){
        this.classroom.setHeight(height);
        return this;
    }
    /**
     * Builds the classroom object based on the provided properties.
     *
     * @return The constructed Classroom object
     */
    public Classroom build(){
        return this.classroom;
    }

}
