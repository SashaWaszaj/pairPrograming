package dog;

import Animal.Animal;

public class dog extends Animal {
    // Constructor
    public dog(String name, String breed) {
        super(name, breed);
    }


    @Override
    public void makeSound () {
        System.out.println("Guau");
    }
}