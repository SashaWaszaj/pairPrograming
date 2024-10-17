package FileReaderAnimal;

import java.io.IOException;
import java.util.List;

import InterfaceAnimal.Animal;
import InterfaceAnimal.Zoo;
import InterfaceAnimal.ZooArea;

public class FileReaderAnimalMain {
    public static void prueba() {
        try {
            Zoo zoo = FileAnimalCreator.createZooFromFile("src/FileReaderAnimal/zoo.csv");
            List<ZooArea> areas = FileAnimalCreator.createZooAreasFromFile("src/FileReaderAnimal/areas.csv", zoo);
            List<Animal> animals = FileAnimalCreator.createAnimalsFromFile("src/FileReaderAnimal/animals.csv", areas);

            // for (ZooArea area : zoo.getAreas()) {
            // System.out.println(area.toString());
            // }

            for (Animal animal : animals) {
                System.out.println(animal.toString());
            }

            int umbralAnimales = 1;
            System.out.println("Areas con mayor a " + umbralAnimales + " de numero de animales");
            zoo.getAreas().stream().filter(area -> area.getNumberOfAnimals() > umbralAnimales).forEach(area -> {
                System.out.println(area.toString());
            });
        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}
