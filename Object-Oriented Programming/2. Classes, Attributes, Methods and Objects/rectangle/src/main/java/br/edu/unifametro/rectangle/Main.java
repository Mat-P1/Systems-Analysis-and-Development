package br.edu.unifametro.rectangle;

/* Create a class representing a rectangle.The class has length and width attributes. This class must have methods that
 * calculate perimeter and area. The class must guarantee that length and width assume values greater than 0.
 * */

public class Main {
    public static void main(String[] args) {

        // Testing if constructor only accepts values greater than zero
        // Rectangle r1 = new Rectangle(0, 0); // This line will throw a new exception

        Rectangle r2 = new Rectangle(10, 10);

        System.out.println("Perimeter: " + r2.getPerimeter() + "\nArea: " + r2.getArea());
    }
}