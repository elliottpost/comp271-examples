package part3;

import java.util.Scanner;

/**
 * Primary Shape Handler
 */
public class App2 {

    private static Scanner sc;
    private static Shape s;

    public static void main(String[] args)
    {
        // declare & init vars
        sc = new Scanner(System.in);

        // loop
        do {
            printOptions();
            s = create();
            printShape();
        } while (s != null);
    }

    private static void printOptions()
    {
        System.out.println("Type the number of the option you wish to create:");
        System.out.println("1: Rectangle");
        System.out.println("2: Square");
        System.out.println("3: Parallelogram");
        System.out.println("4: Circle");
        System.out.println("0: Exit");
    }

    private static Shape create()
    {
        // ensure they enter an integer
        if (!sc.hasNextInt()) {
            System.out.println("Invalid option.");
            return null;
        }

        switch (sc.nextInt()) {
            case 1:
                return createRect();
            case 2:
                return createSquare();
            case 3:
                return createParallelogram();
            case 4:
                return createCircle();
        }

        return null;
    }

    private static Rectangle createRect()
    {
        double h, w;
        System.out.print("Height: ");
        h = sc.nextDouble();
        System.out.print("Width: ");
        w = sc.nextDouble();
        return new Rectangle(h, w);
    }

    private static Square createSquare()
    {
        double h;
        System.out.print("Height: ");
        h = sc.nextDouble();
        return new Square(h);
    }

    private static Parallelogram createParallelogram()
    {
        double h, w;
        System.out.print("Height: ");
        h = sc.nextDouble();
        System.out.print("Width: ");
        w = sc.nextDouble();
        return new Parallelogram(h, w);
    }

    private static Circle createCircle()
    {
        double r;
        System.out.print("Radius: ");
        r = sc.nextDouble();
        return new Circle(r);
    }

    private static void printShape()
    {
        if (s != null) {
            System.out.println("The shape looks like: ");
            s.print();

            System.out.println("\nAnd it has an area of: " + s.getArea());
        }
    }
}
