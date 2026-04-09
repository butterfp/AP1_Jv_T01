import java.util.Scanner;

public class AscendingSequence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        if (!console.hasNextLine()) return;
        String input = console.nextLine();

        Scanner lineScanner = new Scanner(input);

        int prev = 0;
        int current;
        int counter = 0;
        int faultIndex = -1;
        boolean isOrdered = true;
        boolean hasInvalidInput = false;

        while (lineScanner.hasNext()) {
            if (lineScanner.hasNextInt()) {
                current = lineScanner.nextInt();
                counter++;

                if (counter > 1 && isOrdered) {
                    if (current < prev) {
                        isOrdered = false;
                        faultIndex = counter - 1;
                    }
                }
                prev = current;
            } else {
                hasInvalidInput = true;
                break;
            }
        }

        if (counter == 0 && !hasInvalidInput) {
            System.out.println("Input error");
        } else if (counter == 0 && hasInvalidInput) {
            System.out.println("Input error");
        } else {
            if (isOrdered) {
                System.out.println("The sequence is ordered in ascending order");
            } else {
                System.out.println("The sequence is not ordered from the ordinal number of the number " + faultIndex);
            }
        }

        lineScanner.close();
    }
}