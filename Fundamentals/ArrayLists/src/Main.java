import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        int numOffFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOffFood; i++){
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();


//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(3);
//        list.add(1);
//        list.add(2);
//
//        System.out.println(list);

//        ArrayList<Double> list = new ArrayList<>();
//
//        list.add(3.14);
//        list.add(1.99);
//        list.add(2.01);
//
//        System.out.println(list);

//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("Apple");
//        fruits.add("Orange");
//        fruits.add("Banana");
//        fruits.add("Coconut");
//
//        //fruits.remove(1);
//        //fruits.set(0, "Pineapple");
//
//        //System.out.println(fruits);
//        //System.out.println(fruits.get(0));
//        //System.out.println(fruits.size());
//
//        Collections.sort(fruits);
//
//        for (String fruit : fruits){
//            System.out.println(fruit);
//        }

    }
}
