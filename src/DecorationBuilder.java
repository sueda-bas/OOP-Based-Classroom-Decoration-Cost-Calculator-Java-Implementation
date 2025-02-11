/**
 * The DecorationBuilder class is responsible for constructing instances of the Decoration class.
 * It provides methods to set properties such as name, type, price, and area coverage of a decoration item,
 * and finally builds the decoration object.
 */
public class DecorationBuilder{
    private Decoration decoration;
    /**
     * Constructs a new DecorationBuilder instance.
     */
    public DecorationBuilder(){
        this.decoration = new Decoration();
    }

    /**
     * Sets the name of the decoration item.
     *
     * @param name The name of the decoration item
     * @return The DecorationBuilder instance
     */
    public DecorationBuilder setName(String name){
        this.decoration.setName(name);
        return this;
    }

    /**
     * Sets the type of the decoration item.
     *
     * @param type The type of the decoration item
     * @return The DecorationBuilder instance
     */
    public DecorationBuilder setType(String type){
        this.decoration.setType(type);
        return this;
    }

    /**
     * Sets the price of the decoration item.
     *
     * @param price The price of the decoration item
     * @return The DecorationBuilder instance
     */
    public DecorationBuilder setPrice(float price){
        this.decoration.setPrice(price);
        return this;
    }

    /**
     * Sets the area coverage of the decoration item.
     *
     * @param area The area coverage of the decoration item
     * @return The DecorationBuilder instance
     */
    public DecorationBuilder setArea(float area){
        this.decoration.setArea(area);
        return this;
    }

    /**
     * Builds the decoration object based on the provided properties.
     *
     * @return The constructed Decoration object
     */
    public Decoration build(){
        return this.decoration;
    }
}
