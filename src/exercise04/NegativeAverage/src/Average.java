import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        int size = inputInt();

        if (size <= 0) {
            System.out.println("Input error. Size <= 0");
        } else {
            int[] numbers = fillArray(size);

            // 3. Расчет и вывод среднего арифметического
            calculateAndPrintNegativeAverage(numbers);
        }
    }

    // МЕТОД ВВОДА (с защитой от "дурака")
    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Could not parse a number. Please, try again");
                scanner.next(); // Очистка буфера
            }
        }
    }

    // МЕТОД ЗАПОЛНЕНИЯ МАССИВА
    public static int[] fillArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = inputInt();
        }
        return array;
    }

    // МЕТОД РАСЧЕТА И ВЫВОДА
    public static void calculateAndPrintNegativeAverage(int[] array) {
        long sum = 0;
        int count = 0;

        // Цикл с предусловием for для обхода массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
                count++;
            }
        }

        if (count == 0) {
            System.out.println("There are no negative elements");
        } else {
            // Среднее арифметическое = Сумма / Количество
            long average = sum / count;
            System.out.println(average);
        }
    }
}