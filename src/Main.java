import Animal.Animal;
import InterfaceAnimal.InterfaceAnimal;
import cat.cat;
import dog.dog;

public class Main {
    public static void main(String[] args) {

        Animal cat = new cat("micha", "carey");
        Animal dog = new dog("Firulais", "Tom");

        cat.makeSound();

        InterfaceAnimal.prueba();
    }
    // hola
}
