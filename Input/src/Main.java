import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm²");

//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("What is your gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("\nHello " + name);
//        System.out.println("You are " + age + " years old");
//        System.out.println("You gpa is: " + gpa);
//
//        if (isStudent){
//            System.out.println("You are enrolled as a student");
//        } else {
//            System.out.println("You are NOT enrolled");
//        }

        scanner.close();
    }
}
