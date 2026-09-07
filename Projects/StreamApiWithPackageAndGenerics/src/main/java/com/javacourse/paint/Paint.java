package main.java.com.javacourse.paint;

public class Paint<E extends Painting> {
    private E thingsToPaint;
    private String type;
    private String brand;
    private double price;

    public Paint(E thingsToPaint, String type, String brand, double price){
        this.thingsToPaint = thingsToPaint;
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    public E getThingsToPaint() {
        return thingsToPaint;
    }

    public void setThingsToPaint(E thingsToPaint) {
        this.thingsToPaint = thingsToPaint;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void paint(){
        this.thingsToPaint.applyPaint();
    }
}
