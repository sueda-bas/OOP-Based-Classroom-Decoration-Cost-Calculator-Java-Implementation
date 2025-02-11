/**
 * The Decoration class represents a decoration item with properties such as name, type, price, and area coverage.
 * It provides methods to calculate the count of tiles needed for floor and wall decoration in a classroom,
 * as well as methods to calculate the cost of wall and floor decoration.
 */
public class Decoration {
    private String name;
    private String type;
    private float price;
    private float area;


    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public float getArea() {
        return area;
    }


    /**
     * Calculates the count of tiles needed for floor decoration in the given classroom.
     *
     * @param classroom The classroom object
     * @return The count of tiles needed for floor decoration
     */
    public int calculateCountOfTilesOnFloor (Classroom classroom){
        double area = classroom.calculateFloorArea(classroom.getWidth(), classroom.getLength());
        int count = (int) Math.ceil(area / this.getArea());
        return count;
    }
    /**
     * Calculates the count of tiles needed for wall decoration in the given classroom.
     *
     * @param classroom The classroom object
     * @return The count of tiles needed for wall decoration
     */
    public int calculateCountOfTilesOnWall (Classroom classroom){
        double area = classroom.calculateWallArea(classroom.getWidth(), classroom.getLength(), classroom.getHeight());
        int count = (int) Math.ceil(area / this.getArea());
        return count;
    }
    /**
     * Calculates the cost of wall decoration in the given classroom.
     *
     * @param classroom The classroom object
     * @return The cost of wall decoration
     */
    public int calculateCostOfWall (Classroom classroom){
        int cost = 0;
        if(this.getType().equals("Tile")){
            cost = (int) Math.ceil(calculateCountOfTilesOnWall(classroom) * this.getPrice());
        }else if(this.getType().equals("Paint") || this.getType().equals("Wallpaper")){
            double area = classroom.calculateWallArea(classroom.getWidth(), classroom.getLength(), classroom.getHeight());
            cost = (int) Math.ceil(area * this.getPrice());
        }return cost;
    }
    /**
     * Calculates the cost of floor decoration in the given classroom.
     *
     * @param classroom The classroom object
     * @return The cost of floor decoration
     */
    public int calculateCostOfFloor(Classroom classroom){
        int cost = 0;
        cost = (int) Math.ceil(calculateCountOfTilesOnFloor(classroom) * this.getPrice());
        return cost;
    }
    }

