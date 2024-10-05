package Animal;

public abstract class Animal {
    protected String name;
    protected String breed;

    // Atributo estático para contar el número total de animales
    protected static int totalAnimals = 0;

    // Constructor
    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
        totalAnimals++; // Incrementa el contador de animales
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void makeSound();

    // Método estático para obtener el número total de animales
    public static int getTotalAnimals() {
        return totalAnimals;
    }

    // Getters para obtener el nombre y la raza
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // Método para mostrar información del animal
    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }
}



