import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        var items = new ArrayList<String>();
        items.add("apple");
        items.add("banana");
        items.add("orange");

//        for(String item : items){
//            if(item.startsWith("a"))
//                System.out.println(item.toUpperCase());
//        }

        //Stream - filter, order, transform, ...
        //forEach, collect, reduce

        items.stream()
                .filter(item -> item.startsWith("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


        var modifiedList = items.stream()
                .filter(item -> item.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(modifiedList);

        var frutasTeste = items.stream()
                .filter(item -> item.startsWith("a"))
                .map(String::toUpperCase)
                .toList();

        System.out.println(frutasTeste);
        //-----------------------------------------------------

        var numbers = List.of(1, 2, 3, 4, 5);

        var sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        //-----------------------------------------------------

        items.parallelStream()
                .forEach(item -> System.out.println(Thread.currentThread() + " - " + item));
    }
}
