package Animal;

public class Lion extends Animal {
    public Lion(String breed, String name) {
        super(name, breed);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    @Override
    public String toString() {
        return "Lion - Name: " + name + ", Breed: " + breed;
    }
}
