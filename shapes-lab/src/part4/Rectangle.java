package part4;

/**
 * Basic rectangle
 */
public class Rectangle extends ShapeBase {

    private double height = 0, width = 0;

    /**
     * Constructs the rectangle
     * @param h the height
     * @param w the width
     */
    public Rectangle(double h, double w) {
        setDimensions(h, w);
    }

    /**
     * Sets the dimensions of the rectangle
     * @param h the height
     * @param w the width
     */
    public void setDimensions(double h, double w)
    {
        if (h <= 0 || w <= 0) {
            System.out.println("Each dimension must be greater than 0");
            System.exit(1);
        }

        height = h;
        width = w;
    }

    /**
     * Gets the width
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Gets the height
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Returns the area
     * @return the area
     */
    public double getArea()
    {
        return getHeight() * getWidth();
    }

    /**
     * Prints the rectangle
     */
    public void print()
    {
        for (int rows = 0; rows < getHeight() * scale; rows++) {
            for (int cols = 0; cols < getWidth() * scale; cols++) {
                if (cols == 0)
                    System.out.print("*");
                else if (cols == getWidth() * scale - 1)
                    System.out.print(" *");
                else
                    if (rows == 0 || rows == getHeight() * scale - 1)
                        System.out.print(" *");
                    else
                        System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
