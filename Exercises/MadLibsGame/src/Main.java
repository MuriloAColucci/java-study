import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter an noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday i went to a " + adjective1 + " zoo.");
        System.out.println("In a exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");
    }
}
