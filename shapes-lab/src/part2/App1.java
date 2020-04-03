package part2;

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
        boolean loop = true;
        int option;
        Rectangle r;

        // loop
        while (loop) {
            r = null;

            printOptions();

            // ensure they enter an integer
            if (!sc.hasNextInt()) {
                System.out.println("Invalid option.");
                System.exit(1);
            }

            option = sc.nextInt();
            switch (option) {
                case 1:
                    r = createRect();
                    break;

                case 2:
                    r = createSquare();
                    break;

                case 3:
                    r = createParallelogram();
                    break;

                default:
                    loop = false;
                    break;
            }

            if (r != null) {
                System.out.println("The shape looks like: ");
                r.print();

                System.out.println("\nAnd it has an area of: " + r.getArea());
            }

        }
    }

    public static void printOptions()
    {
        System.out.println("Type the number of the option you wish to create:");
        System.out.println("1: Rectangle");
        System.out.println("2: Square");
        System.out.println("3: Parallelogram");
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
}
