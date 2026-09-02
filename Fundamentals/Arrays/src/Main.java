import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] fruits = {"apple", "orange", "banana", "coconut"};

//        fruits[0] = "pineapple";
//        int numOffFruits = fruits.length;
//        Arrays.sort(fruits);
//        Arrays.fill(fruits, "pineapple");

//        for(int i = 0; i < numOffFruits; i++){
//            System.out.print(fruits[i] + " ");
//        }

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
