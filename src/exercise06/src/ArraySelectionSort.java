import java.util.Scanner;
import java.util.Locale;

/**
 * math module that performs
 * an ascending sort on an array
 */
public class ArraySelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int size = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                break;
            } else {
                System.out.println("Could not parse a number. Please, try again");
                scanner.next();
            }
        }

        if (size <= 0) {
            System.out.println("Input error. Size <= 0");
            return;
        }

        double[] array = new double[size];
        int i = 0;

        while (i < size) {
            if (scanner.hasNextDouble()) {
                array[i] = scanner.nextDouble();
                i++;
            } else {
                System.out.println("Could not parse a number. Please, try again");
                scanner.next();
            }
        }

        selectionSort(array);

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + (j == array.length - 1 ? "" : " "));
        }
        System.out.println();
    }

    public static void selectionSort(double[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}