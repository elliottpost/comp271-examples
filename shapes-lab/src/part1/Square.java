package part1;

/**
 * Basic rectangle with height = width (square)
 */
public class Square {

    private double height = 0;

    /**
     * Constructs the square
     * @param h the height
     */
    public Square(double h) {
        setDimensions(h);
    }

    /**
     * Sets the dimensions of the square
     * @param h the height
     */
    public void setDimensions(double h)
    {
        if (h <= 0) {
            System.out.println("Each dimension must be greater than 0");
            System.exit(1);
        }

        height = h;
    }

    /**
     * Gets the width
     * @return the width
     */
    public double getWidth() {
        return height;
    }

    /**
     * Gets the height
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Prints the rectangle
     */
    public void print()
    {
        for (int rows = 0; rows < getHeight(); rows++) {
            for (int cols = 0; cols < getWidth(); cols++) {
                if (cols == 0)
                    System.out.print("*");
                else if (cols == getWidth() - 1)
                    System.out.print(" *");
                else
                    if (rows == 0 || rows == getHeight() - 1)
                        System.out.print(" *");
                    else
                        System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
