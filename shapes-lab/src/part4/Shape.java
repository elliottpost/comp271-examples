package part4;

/**
 * Defines a shape's requirements
 */
public interface Shape {
    /**
     * Returns the area
     * @return the area
     */
    double getArea();

    /**
     * Prints the shape
     */
    void print();


    /**
     * @todo
     * Returns a string representing the type of shape
     * Ex: Rectangle should return "Rectangle"
     * Ex: Square returns "Square", etc..
     * @return the type of shape
     */
    String getType();

    /**
     * @todo
     * Sets the ID of the shape
     * @param id the ID
     */
//    void setId(int id);

    /**
     * @todo
     * Returns an int representing the ID of the shape
     * @return the ID of shape
     */
//    int getId();

}
