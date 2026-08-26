import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        //int
        int number1, number2, number3;

        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        //double
        double number;

        number = random.nextDouble();
        System.out.println(number);

        //boolean
        boolean isHeads;

        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}
