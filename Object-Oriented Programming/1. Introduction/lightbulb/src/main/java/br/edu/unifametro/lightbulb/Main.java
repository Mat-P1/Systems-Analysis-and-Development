package br.edu.unifametro.lightbulb;

/*
 * Create a class to represent a light bulb that is for sale in a supermarket. Create a function to turn it on and another
 * to turn it off.
 * */

public class Main {
    public static void main(String[] args) {

        Lightbulb led = new Lightbulb("Samsung", 220, "Led",
                "Led Red", "Red", 15, "30 Days");

        System.out.println(led);
        led.isOn();
        led.isOff();
    }
}