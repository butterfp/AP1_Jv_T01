import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count;
        if (scanner.hasNextInt()) {
            count = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Input error");
            return;
        }

        List<String> allStrings = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (scanner.hasNextLine()) {
                allStrings.add(scanner.nextLine());
            }
        }

        String query = "";
        if (scanner.hasNextLine()) {
            query = scanner.nextLine();
        }

        List<String> filteredList = filterStrings(allStrings, query);

        if (filteredList.isEmpty()) {
            System.out.println();
        } else {
            for (int i = 0; i < filteredList.size(); i++) {
                System.out.print(filteredList.get(i));
                if (i < filteredList.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static List<String> filterStrings(List<String> source, String substring) {
        List<String> result = new ArrayList<>();

        for (String s : source) {
            if (s.contains(substring)) {
                result.add(s);
            }
        }

        return result;
    }
}