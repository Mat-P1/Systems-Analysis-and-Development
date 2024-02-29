package br.edu.unifametro.rectangle;

public class Rectangle {

    public float length;
    public float width;

    public Rectangle(float length, float width) throws IllegalArgumentException {
        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        } else {
            throw new IllegalArgumentException("Invalid data. Try again with values greater than zero.");
        }
    }

    public float getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public float getArea() {
        return (this.length * this.width);
    }
}
