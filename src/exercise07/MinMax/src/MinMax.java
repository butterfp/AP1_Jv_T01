import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;

public class MinMax {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String path = console.nextLine();

        File file = new File(path);

        try (Scanner fileScanner = new Scanner(file).useLocale(Locale.US)) {
            if (!fileScanner.hasNextInt()) {
                System.out.println("Input error. Could not read size.");
                return;
            }

            int expectedSize = fileScanner.nextInt();

            if (expectedSize <= 0) {
                System.out.println("Input error. Size <= 0");
                return;
            }

            double[] array = new double[expectedSize];
            int actualCount = 0;

            while (fileScanner.hasNext() && actualCount < expectedSize) {
                if (fileScanner.hasNextDouble()) {
                    array[actualCount] = fileScanner.nextDouble();
                    actualCount++;
                } else {
                    fileScanner.next();
                }
            }

            if (actualCount < expectedSize) {
                System.out.println("Input error. Insufficient number of elements");
                return;
            }

            System.out.println(expectedSize);
            for (int i = 0; i < actualCount; i++) {
                System.out.print(array[i] + (i == actualCount - 1 ? "" : " "));
            }
            System.out.println();

            double min = findMin(array);
            double max = findMax(array);

            saveResult(min, max);

        } catch (FileNotFoundException e) {
            System.out.println("Input error. File doesn't exist");
        }
    }

    public static double findMin(double[] arr) {
        double min = arr[0];
        for (double val : arr) {
            if (val < min) min = val;
        }
        return min;
    }

    public static double findMax(double[] arr) {
        double max = arr[0];
        for (double val : arr) {
            if (val > max) max = val;
        }
        return max;
    }

    public static void saveResult(double min, double max) {
        try (PrintWriter writer = new PrintWriter("result.txt")) {
            writer.print(min + " " + max);
            System.out.println("Saving min and max values in file");
        } catch (FileNotFoundException e) {
            System.out.println("Error saving to file.");
        }
    }
}