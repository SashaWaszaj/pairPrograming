package InterfaceAnimal;

import java.util.ArrayList;
import java.util.List;

public class ZooArea {
    String name;
    List<Animal> animals = new ArrayList<>();
    int maxCapacity;

    public ZooArea (String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public boolean addAnimal(Animal animal) {
        if (animals.size() < maxCapacity){
            animals.add(animal);
            return true;
        }
        System.out.println("Max capacity reached");
        return false;
    }

    public String getName() {
        return name;
    }

    public List<Animal> getAnimals() {
        return new ArrayList<>(animals); // return a copy of animals
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    @Override
    public String toString() {
        return "ZooArea: " + name + "\nAnimals " + animals;
    }
}
