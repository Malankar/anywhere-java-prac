package collectionclass.arraylisteg;
import java.util.ArrayList;
import java.util.Scanner;

public class UserChoices {
    private ArrayList<String> choices;

    public UserChoices() {
        choices = new ArrayList<>();
    }

    public void addChoice(String choice) {
        choices.add(choice);
    }

    public void printChoices() {
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ": " + choices.get(i));
        }
    }

    public static void main(String[] args) {
        UserChoices userChoices = new UserChoices();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice (or 'q' to quit):");
            String choice = scanner.nextLine();

            if (choice.equals("q")) {
                break;
            }

            userChoices.addChoice(choice);
        }
        scanner.close();
        System.out.println("You made the following choices:");
        userChoices.printChoices();
    }
}
