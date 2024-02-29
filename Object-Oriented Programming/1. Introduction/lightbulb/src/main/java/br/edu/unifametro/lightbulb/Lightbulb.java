package br.edu.unifametro.lightbulb;

public class Lightbulb {

    public String brand;
    public int voltage;
    public String type;
    public String model;
    public String color;
    public double price;
    public String warranty;

    public Lightbulb(String brand, int voltage, String type, String model, String color, double price, String warranty) {
        this.brand = brand;
        this.voltage = voltage;
        this.type = type;
        this.model = model;
        this.color = color;
        this.price = price;
        this.warranty = warranty;
    }

    public void isOn() {
        System.out.println("Lightbulb is ON");
    }

    public void isOff() {
        System.out.println("Lightbulb is OFF");
    }

    @Override
    public String toString() {
        return "Lightbulb {" + "brand = " + brand + ", voltage = " + voltage + ", "
                + "type = " + type + ", model = " + model + ", color = " + color + ", "
                + "price = " + price + ", warranty = " + warranty + '}';
    }
}
