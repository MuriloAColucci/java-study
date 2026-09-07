import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Box<String> box1 = new Box<>();
//        Box<Integer> box2 = new Box<>();
//
//        box1.setItem("banana");
//        box2.setItem(5);
//
//        System.out.println(box1.getItem());
//        System.out.println(box2.getItem());

        Product<String, Double> product1 = new Product<>("apple", 0.50);
        Product<String, Integer> product2 = new Product<>("ticket", 15);

        System.out.println(product1.getItem() + " " + product1.getPrice());
        System.out.println(product2.getItem() + " " + product2.getPrice());
    }
}
