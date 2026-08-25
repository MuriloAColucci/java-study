import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Math.PI);
//        System.out.println(Math.E);

//        double result;
//
//        result = Math.pow(2, 5);        //elevado a
//        result = Math.abs(-5);          //negativo a positivo
//        result = Math.sqrt(9);          //raiz quadrada
//        result = Math.round(3.14);      //arredondar
//        result = Math.ceil(3.14);       //arredondar no maior
//        result = Math.floor(3.14);      //arredondar no menor
//        result = Math.max(10, 20);      //pegar o maior
//        result = Math.min(10, 20);      //pegar o mínimo
//
//        System.out.println(result);


//----------------------------------------------------------------------
        //HYPOTENUSE c = Math.sqrt(a² + b²)

//        Scanner scanner = new Scanner(System.in);
//
//        double a, b, c;
//
//        System.out.print("Enter the length of side A: ");
//        a = scanner.nextDouble();
//
//        System.out.print("Enter the length of side A: ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//
//        System.out.println("The hypotenuse (side c) is: " + c + "cm");

//----------------------------------------------------------------------

        //circumference = 2 * Math.PI * radius;
        //area = Math.PI * Math.pow(radius, 2);
        //volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double radius, circumference, area, volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.2fcm\n", circumference);
        System.out.printf("The area is: %.2fcm²\n", area);
        System.out.printf("The volume is: %.2fcm³\n", volume);

        scanner.close();
    }
}
