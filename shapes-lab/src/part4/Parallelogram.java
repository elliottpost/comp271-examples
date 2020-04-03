package part4;

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
        for (int rows = 0; rows < getHeight() * scale; rows++) {
            // print leading white space
            System.out.print(new String(new char[rows]).replace("\0", " "));
            for (int cols = 0; cols < getWidth() * scale; cols++) {
                if (rows == 0)
                    System.out.print("* ");
                else if (rows == (getHeight() * scale) - 1)
                    System.out.print("* ");
                else {
                    if (cols == 0)
                        System.out.print("\\");
                    else if (cols == (getWidth() * scale) - 1)
                        System.out.print(" \\");
                    else
                        System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
