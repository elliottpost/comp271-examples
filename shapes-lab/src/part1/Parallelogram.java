package part1;

/**
 * Basic rectangle
 */
public class Parallelogram {

    private double height = 0, width = 0;

    /**
     * Constructs the parallelogram
     * @param h the height
     * @param w the width
     */
    public Parallelogram(double h, double w) {
        setDimensions(h, w);
    }

    /**
     * Sets the dimensions of the parallelogram
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
     * Prints the parallelogram
     */
    public void print()
    {
        for (int rows = 0; rows < getHeight(); rows++) {
            // print leading white space
            System.out.print(new String(new char[rows]).replace("\0", " "));
            for (int cols = 0; cols < getWidth(); cols++) {
                if (rows == 0)
                    System.out.print("* ");
                else if (rows == getHeight() - 1)
                    System.out.print("* ");
                else {
                    if (cols == 0)
                        System.out.print("\\");
                    else if (cols == getWidth() - 1)
                        System.out.print(" \\");
                    else
                        System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
