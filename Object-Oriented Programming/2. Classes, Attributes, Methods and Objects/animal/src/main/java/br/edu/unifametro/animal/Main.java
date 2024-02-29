package br.edu.unifametro.animal;

/*
 * Create a representing animals. It has the following attributes: type (mammals, bird or fish), name and age.
 * This class must contain the following methods: Calculate the amount of food consumed per year by each type knowing that
 * a mammal eats 2 kilos/day, a bird eats 100g/day and a fish 20g/day.
 * */

import br.edu.unifametro.animal.Enumerations.Type;

public class Main {
    public static void main(String[] args) {

        Animal mammal = new Animal(Type.Mammal, "Cat", 10);
        Animal bird = new Animal(Type.Bird, "Parrot", 25);
        Animal fish = new Animal(Type.Fish, "Goldfish", 2);

        mammal.calculateAmountFood();
        bird.calculateAmountFood();
        fish.calculateAmountFood();
    }
}