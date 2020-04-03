package part3;

import java.util.Scanner;

/**
 * Primary Shape Handler
 */
public class App1 {
    private static Scanner sc;
    public static void main(String[] args)
    {
        // declare & init vars
        sc = new Scanner(System.in);
        int option;
        Shape s;

        // loop
        do {
            s = null;

            printOptions();

            // ensure they enter an integer
            if (!sc.hasNextInt()) {
                System.out.println("Invalid option.");
                System.exit(1);
            }

            option = sc.nextInt();
            switch (option) {
                case 1:
                    s = createRect();
                    break;

                case 2:
                    s = createSquare();
                    break;

                case 3:
                    s = createParallelogram();
                    break;

                case 4:
                    s = createCircle();
                    break;
            }

            if (s != null) {
                System.out.println("The shape looks like: ");
                s.print();

                System.out.println("\nAnd it has an area of: " + s.getArea());
            }

        } while  (s != null);
    }

    public static void printOptions()
    {
        System.out.println("Type the number of the option you wish to create:");
        System.out.println("1: Rectangle");
        System.out.println("2: Square");
        System.out.println("3: Parallelogram");
        System.out.println("4: Circle");
        System.out.println("0: Exit");
    }

    public static Rectangle createRect()
    {
        double h, w;
        System.out.print("Height: ");
        h = sc.nextDouble();
        System.out.print("Width: ");
        w = sc.nextDouble();
        return new Rectangle(h, w);
    }

    public static Square createSquare()
    {
        double h;
        System.out.print("Height: ");
        h = sc.nextDouble();
        return new Square(h);
    }

    public static Parallelogram createParallelogram()
    {
        double h, w;
        System.out.print("Height: ");
        h = sc.nextDouble();
        System.out.print("Width: ");
        w = sc.nextDouble();
        return new Parallelogram(h, w);
    }

    public static Circle createCircle()
    {
        double r;
        System.out.print("Radius: ");
        r = sc.nextDouble();
        return new Circle(r);
    }
}
