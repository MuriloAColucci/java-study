package main.java.com.javacourse.car;

public class Car {
    String model;
    String color;
    int year;
    String plate;

    public Car(String model, String color, int year, String plate){
        this.model = model;
        this.color = color;
        this.year = year;
        this.plate = plate;
    }

    public void start(){
        System.out.println("Car turned on");
    }
    public void stop(){
        System.out.println("Car turned off");
    }
}