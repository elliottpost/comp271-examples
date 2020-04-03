package part4;

import java.util.Scanner;

/**
 * Primary Shape Handler
 */
public class App {

    private static Scanner keyboard;
    private static Shape s;

    public static void main(String[] args)
    {
        // declare & init vars
        keyboard = new Scanner(System.in);

        // loop
        do {
            printOptions();
            s = create();
            if (s != null) {
                // @todo ask the user for a scale (type double)
                // @todo and assign that scale to the shape before printing

                printShape();
            }
        } while (s != null);
    }

    private static void printOptions()
    {
        Shape myShape = new Triangle();
        myShape = new Rectangle();
        myShape = new Square();

        Triangle myOtherShape = new Triangle();
        myOtherShape = new Rectangle();

        System.out.println("Type the number of the option you wish to create:");
        System.out.println("1: Parallelogram");
        System.out.println("2: Rectangle");
        System.out.println("3: Square");
        System.out.println("4: Circle");
        System.out.println("0: Exit");
    }

    private static Shape create()
    {

        // ensure they enter an integer
        if (!keyboard.hasNextInt()) {
            System.out.println("Invalid option.");
            return null;
        }

        switch (keyboard.nextInt()) {
            case 1:
                return createParallelogram();
            case 2:
                return createRect();
            case 3:
                return createSquare();
            case 4:
                return createCircle();
        }


        return null;
    }

    private static Rectangle createRect()
    {
        double h, w;
        System.out.print("Height: ");
        h = keyboard.nextDouble();
        System.out.print("Width: ");
        w = keyboard.nextDouble();
        return new Rectangle(h, w);
    }

    private static Square createSquare()
    {
        double h;
        System.out.print("Height: ");
        h = keyboard.nextDouble();
        return new Square(h);
    }

    private static Parallelogram createParallelogram()
    {
        double h, w;
        System.out.print("Height: ");
        h = keyboard.nextDouble();
        System.out.print("Width: ");
        w = keyboard.nextDouble();
        return new Parallelogram(h, w);
    }

    private static Circle createCircle()
    {
        double r;
        System.out.print("Radius: ");
        r = keyboard.nextDouble();
        return new Circle(r);
    }

    private static void printShape()
    {
        if (s != null) {
            System.out.println("Shape " + s + " looks like: ");
            s.print();

            System.out.println("\nAnd it has an area of: " + s.getArea());
        }
    }
}
