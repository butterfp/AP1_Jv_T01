import java.util.Scanner;

public class FirstandLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        int[] array = new int[size];
        int[] resultBuffer = new int[size];
        int resultCount = 0;
        int i = 0;

        while (i < size) {
            if (scanner.hasNextInt()) {
                int currentNumber = scanner.nextInt();
                array[i] = currentNumber;

                if (isMatch(currentNumber)) {
                    resultBuffer[resultCount] = currentNumber;
                    resultCount++;
                }
                i++;
            } else {
                System.out.println("Could not parse a number. Please, try again");
                scanner.next();
            }
        }

        if (resultCount == 0) {
            System.out.println("There are no such elements");
        } else {
            for (int j = 0; j < resultCount; j++) {
                System.out.print(resultBuffer[j] + (j == resultCount - 1 ? "" : " "));
            }
            System.out.println();
        }
    }

    public static boolean isMatch(int number) {
        int n = Math.abs(number);
        int lastDigit = n % 10;
        int firstDigit = n;

        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        return firstDigit == lastDigit;
    }
}