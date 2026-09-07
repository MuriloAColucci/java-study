package main.java.com.javacourse;

import main.java.com.javacourse.car.Car2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Jhon");
        list.add("Junior");
        list.add("Murilo");

        //Set não repete valores, são únicos
        Set<String> setStrings = new HashSet<>();
        setStrings.add("Jhon");
        setStrings.add("Junior");
        setStrings.add("Murilo");
        setStrings.add("Murilo");

        //System.out.println("Set: " + setStrings.contains("Murilo"));
        //System.out.println("setStrings: " + setStrings);

        Map<String, String> map = new HashMap<>();
        map.put("name", "Murilo");
        map.put("surname", "Colucci");

        //System.out.println(map.get("name"));
        //System.out.println(map.get("surname"));

        Queue<String> queue = new LinkedList<>();
        queue.add("Murilo");
        queue.add("Jhon");

        //System.out.println("Queue: " + queue);
        //System.out.println("Queue: " + queue.poll());
        //System.out.println("Queue: " + queue.peek());
        //System.out.println("Queue: " + queue.remove());
        //System.out.println("Queue: " + queue);

        LinkedList<String> linked = new LinkedList<>();

        //Records
        Car2 car2 = new Car2("Sandero", "Preto", 2020, "ABC-1234");
        System.out.println(car2.model());
        System.out.println(car2.year());

        //Stream API
        //realizar operações funcionais nas nossas collections (estruturas de dados)
        //filter, map, reduce, agregation

        List<String> listNames = new ArrayList<>();
        listNames.add("Jhon Stuart");
        listNames.add("Jhon Jones");
        listNames.add("Jhon Dark");
        listNames.add("Junior Alfonso");
        listNames.add("Murilo Colucci");

//        List<String> jhons = listNames.stream()
//                .filter(name -> name.startsWith("Jhon"))
//                .map(String::toUpperCase) //name -> name.toUpperCase()
//                .toList();
//        System.out.println("Jhon's: " + jhons);

//        String jhons = listNames.stream()
//                .filter(name -> name.startsWith("Jhon"))
//                .map(String::toUpperCase)
//                .map(name -> name.replaceAll(" ", ""))
//                .reduce("", (a, b) -> a + b);
//        System.out.println("Jhon's: " + jhons);

        Set<String> jhons = listNames.stream()
                .filter(name -> name.startsWith("Jhon"))
                .map(String::toUpperCase)
                .map(name -> name.replaceAll(" ", ""))
                .collect(Collectors.toSet());
        System.out.println("Jhon's: " + jhons);

    }
}
