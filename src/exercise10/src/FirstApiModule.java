import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *  Module that finds the names of adult users
 */
public class FirstApiModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        List<String> errorMessages = new ArrayList<>();

        if (!scanner.hasNextInt()) return;
        int targetCount = scanner.nextInt();

        while (users.size() < targetCount) {
            if (!scanner.hasNext()) break;
            String name = scanner.next();

            if (!scanner.hasNext()) break;
            String ageInput = scanner.next();

            try {
                int age = Integer.parseInt(ageInput);
                if (age <= 0) {
                    errorMessages.add("Incorrect input. Age <= 0");
                } else {
                    users.add(new User(name, age));
                }
            } catch (NumberFormatException e) {
                errorMessages.add("Could not parse a number. Please, try again");
            }
        }

        for (String error : errorMessages) {
            System.out.println(error);
        }

        String result = users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getName)
                .collect(Collectors.joining(", "));

        if (!result.isEmpty()) {
            System.out.println(result);
        }
    }
}