import java.util.Scanner;

/**
 * math module that finds
 * the n-th Fibonacci number.
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n = inputNumber();

        try {
            long result = calculateFibonacci(n);
            printResult(result);

        } catch (StackOverflowError e) {
            System.out.println("Too large n");
        }
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num < 0) {
                    System.out.println("Please enter a positive number.");
                    continue;
                }
                return num;
            } else {
                System.out.println("Could not parse a number. Please, try again");
                scanner.next();
            }
        }
    }

    public static long calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public static void printResult(long result) {
        System.out.println(result);
    }
}