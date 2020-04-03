package part1;

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
                    System.out.println("The rectangle looks like: ");
                    r.print();
                    break;

                default:
                    loop = false;
                    break;
            }

        }
    }

    public static void printOptions()
    {
        System.out.println("Type the number of the option you wish to create:");
        System.out.println("1: Rectangle");
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
}
