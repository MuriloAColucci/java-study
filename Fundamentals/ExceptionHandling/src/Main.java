import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a number!");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        } catch (Exception e) {
            //SAFETY NET
            System.out.println("Something went wrong");
        } finally {
            System.out.println("This always executes");
        }
    }
}
