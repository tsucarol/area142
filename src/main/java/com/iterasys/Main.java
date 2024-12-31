package com.iterasys;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * A program to calculate areas of geometric shapes.
 * Supports calculations for squares, rectangles, circles, and triangles.
 * Includes a main menu for user interaction.
 */
public final class Main {
    /** The length of the separator line used in the menu display. */
    private static final int LINE_LENGTH = 40;

    /** Option for calculating the area of a square. */
    private static final int SQUARE_OPTION = 1;

    /** Option for calculating the area of a rectangle. */
    private static final int RECTANGLE_OPTION = 2;

    /** Option for calculating the area of a circle. */
    private static final int CIRCLE_OPTION = 3;

    /** Option for calculating the area of a triangle. */
    private static final int TRIANGLE_OPTION = 4;

    /** Option to cancel and exit the program. */
    private static final int CANCEL_OPTION = 0;

    /** Scanner object for user input, using UTF-8 encoding. */
    private static final Scanner SCANNER = new Scanner(
            new InputStreamReader(System.in, StandardCharsets.UTF_8));

    private Main() {
        throw new UnsupportedOperationException("This is a utility class and "
                + "cannot be instantiated.");
    }

    /**
     * The main method of the program. Displays a menu to the user,
     * accepts input for shape selection,
     * and calculates the area based on the selected shape.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(final String[] args) {
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("=".repeat(LINE_LENGTH));
            System.out.println("            AREA CALCULATOR");
            System.out.println("=".repeat(LINE_LENGTH));

            //Main menu
            System.out.println("[1] - Square Area");
            System.out.println("[2] - Rectangle Area");
            System.out.println("[3] - Circle Area");
            System.out.println("[4] - Triangle Area");
            System.out.println("[0] - Cancel");

            System.out.print("\nSelect an option: ");
            int option = SCANNER.nextByte();
            System.out.println("=".repeat(LINE_LENGTH));

            switch (option) {
                case SQUARE_OPTION: // 1
                    System.out.println("SQUARE AREA");
                    System.out.print("Side length: ");
                    float side = SCANNER.nextFloat();
                    System.out.println("Square area = "
                            + squareArea(side));
                    System.out.println("=".repeat(LINE_LENGTH));
                    break;
                case RECTANGLE_OPTION: // 2
                    System.out.println("RECTANGLE AREA");
                    System.out.print("Width: ");
                    float width = SCANNER.nextFloat();
                    System.out.print("Length: ");
                    float length = SCANNER.nextFloat();
                    System.out.println("Rectangle area = "
                            + rectangleArea(width, length));
                    System.out.println("=".repeat(LINE_LENGTH));
                    break;
                case CIRCLE_OPTION: // 3
                    System.out.println("CIRCLE AREA");
                    System.out.print("Radius: ");
                    double radius = SCANNER.nextDouble();
                    System.out.printf("Circle area = %.2f%n",
                            circleArea(radius));
                    System.out.println("=".repeat(LINE_LENGTH));
                    break;
                case TRIANGLE_OPTION: // 4
                    System.out.println("TRIANGLE AREA");
                    System.out.print("Base: ");
                    float base = SCANNER.nextFloat();
                    System.out.print("Height: ");
                    float height = SCANNER.nextFloat();
                    System.out.println("Triangle area = "
                            + triangleArea(base, height));
                    System.out.println("=".repeat(LINE_LENGTH));
                    break;
                case CANCEL_OPTION: // 0
                    System.out.println("         Exiting the program...");
                    System.out.println("=".repeat(LINE_LENGTH));
                    continueCalculating = false;
                    break;
                default:
                    System.out.println("Invalid option. Please select again.");
                    System.out.println("=".repeat(LINE_LENGTH));
                    break;
            }

            // Asking if the user wants to continue
            if (continueCalculating) {
                System.out.print("\nWould you like to make "
                        + "another calculation? (y/n): ");
                String response = SCANNER.next();
                System.out.println();
                if (response.equalsIgnoreCase("n")) {
                    continueCalculating = false;
                    System.out.println("=".repeat(LINE_LENGTH));
                    System.out.println("          Exiting the program...");
                    System.out.println("=".repeat(LINE_LENGTH));
                }
            }
        }
    }

    /**
     * Calculates the area of a square.
     *
     * @param side The length of the square's side.
     * @return The area of the square.
     */
    public static float squareArea(final float side) {
        return side * side;
    }

    /**
     * Calculates the area of a rectangle.
     *
     * @param width The width of the rectangle.
     * @param length The length of the rectangle.
     * @return The area of the rectangle.
     */
    public static float rectangleArea(final float width, final float length) {
        // width: largura | length: altura
        return width * length;
    }

    /**
     * Calculates the area of a circle.
     *
     * @param radius The radius of the circle.
     * @return The area of the circle.
     */
    public static double circleArea(final double radius) {
        return Math.PI * (Math.pow(radius, 2));
    }

    /**
     * Calculates the area of a triangle.
     *
     * @param base The base of the triangle.
     * @param height The height of the triangle.
     * @return The area of the triangle.
     */
    public static float triangleArea(final float base, final float height) {
        return (base * height) / 2;
    }
}
