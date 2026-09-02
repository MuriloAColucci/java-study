import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
//        int target = 7;
        String[] fruits = {"apple", "orange", "banana"};
        String targetString;
        boolean isFound = false;

//        for(int i = 0; i < numbers.length; i++){
//            if(target == numbers[i]){
//                System.out.println("Element found at index: " + i);
//                isFound = true;
//                break;
//            }
//        }

        System.out.print("Enter a fruit to search for: ");
        targetString = scanner.nextLine();

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(targetString)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array");
        }

    }
}
