import java.util.Scanner;
import java.util.Locale;

/**
 * Mathematical module that calculates the perimeter of a triangle
 * using the coordinates of its three vertices.
 */
public class TrianglePerimetr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double[] coords = new double[6];
        int i = 0;

        while (i < 6) {
            if (scanner.hasNextDouble()) {
                coords[i] = scanner.nextDouble();
                i++;
            } else {
                System.out.println("Could not parse a number. Please, try again");
                scanner.next();
            }
        }

        double x1 = coords[0], y1 = coords[1];
        double x2 = coords[2], y2 = coords[3];
        double x3 = coords[4], y3 = coords[5];

        double sideA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double sideB = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double sideC = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            double perimeter = sideA + sideB + sideC;
            System.out.printf(Locale.US, "Perimeter: %.3f\n", perimeter);
        } else {
            System.out.println("It's not a triangle");
        }
    }
}