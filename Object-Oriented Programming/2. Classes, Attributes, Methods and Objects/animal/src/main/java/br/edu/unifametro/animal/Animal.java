package br.edu.unifametro.animal;

import br.edu.unifametro.animal.Enumerations.Type;

public class Animal {

    public Type type;
    public String name;
    public int age;

    public Animal(Type type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public void calculateAmountFood() {

        double amountFood = 0;

        if (this.type == Type.Mammal) {
            amountFood = 365 *  2;
        } else if (this.type == Type.Bird) {
            amountFood = 365 * 0.2;
        } else if (this.type == Type.Fish) {
            amountFood = 365 * 0.02;
        }

        System.out.printf("\nAmount of food consumed by %s (%s) per year: %.2f KG", this.name, this.type, amountFood);
    }
}
