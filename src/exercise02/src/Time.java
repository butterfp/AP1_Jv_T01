import java.util.Scanner;

/**
 * Math module that converts seconds to the format hh:mm:ss.
 * Calculates the number of hours, minutes, and seconds from a total amount of seconds.
 */
public class Time {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSeconds = inputSeconds(scanner);

        if (totalSeconds < 0) {
            System.out.println("Incorrect time");
        } else {
            calculateAndPrintTime(totalSeconds);
        }
        scanner.close();
    }

    public static int inputSeconds(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Could not parse a number. Please, try again");
                scanner.next();
            }
        }
    }

    public static void calculateAndPrintTime(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int remainingSecondsAfterHours = totalSeconds % 3600;
        int minutes = remainingSecondsAfterHours / 60;
        int seconds = remainingSecondsAfterHours % 60;

        printFormattedTime(hours, minutes, seconds);
    }

    public static void printFormattedTime(int h, int m, int s) {
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
    }
}