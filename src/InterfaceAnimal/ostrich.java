package Animal;

public class ostrich extends Animal {
    public ostrich(String breed, String name) {
        super(name, breed);
    }

    @Override
    public void makeSound() {
        System.out.println("Hoot!");
    }

    @Override
    public String toString() {
        return "ostrich - Name: " + name + ", Breed: " + breed;
    }
}
