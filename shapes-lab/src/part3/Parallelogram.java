package part3;

/**
 * Basic rectangle
 */
public class Parallelogram extends Rectangle {

    /**
     * Constructs the parallelogram
     * @param h the height
     * @param w the width
     */
    public Parallelogram(double h, double w) {
        super(h, w);
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
