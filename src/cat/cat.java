package cat;

import Animal.Animal;

public class cat extends Animal {
    // Constructor
    public cat(String name, String breed) {
        super(name, breed);
    }


    @Override
    public void makeSound () {
        System.out.println("Meow");
    }
}