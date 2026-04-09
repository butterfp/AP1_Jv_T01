import java.util.Scanner;

/**
 * math module that calculates
 * the arithmetic mean of negative numbers
 */
public class NegativeAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = inputInt(scanner);

        if (size <= 0) {
            System.out.println("Input error. Size <= 0");
        } else {
            int[] numbers = fillArray(size, scanner);
            calculateAndPrintNegativeAverage(numbers);
        }
    }

    public static int inputInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Could not parse a number. Please, try again");
                scanner.next();
            }
        }
    }

    public static int[] fillArray(int size, Scanner scanner) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = inputInt(scanner);
        }
        return array;
    }

    public static void calculateAndPrintNegativeAverage(int[] array) {
        long sum = 0;
        int count = 0;

        for (int number : array) {
            if (number < 0) {
                sum += number;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("There are no negative elements");
        } else {
            double average = (double) sum / count;
            System.out.println(Math.round(average));
        }
    }
}