package part4;

/**
 * Basic Circle
 */
public class Circle extends ShapeBase {

    private double radius;

    /**
     * Constructs the circle
     * @param r the radius
     */
    public Circle(double r) {
        setRadius(r);
    }

    /**
     * Sets the dimensions of the circle
     * @param r the radius
     */
    public void setRadius(double r)
    {
        if (r <= 0 ) {
            System.out.println("The radius must be greater than 0");
            System.exit(1);
        }

        radius = r;
    }

    /**
     * Gets the radius
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Gets the diameter
     * @return the diameter
     */
    public double getDiameter() {
        return radius*2;
    }

    /**
     * Gets the area
     * @return the area
     */
    public double getArea() {
        return 3.14159 * Math.pow(getRadius() * scale, 2);
    }

    /**
     * Prints the circle
     */
    public void print()
    {
        int n = (int) Math.ceil(getRadius() * scale);

        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if (i*i + j*j <= n*n) System.out.print("* ");
                else                  System.out.print("  ");
            }
            System.out.println();
        }
    }
}
