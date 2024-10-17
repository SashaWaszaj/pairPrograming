package FileReaderAnimal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import InterfaceAnimal.*;

public class FileAnimalCreator {
    public static List<Animal> createAnimalsFromFile(String filename, List<ZooArea> areas) throws IOException {
        List<Animal> animals = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // Skip the first line

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    String type = parts[0].trim();
                    String breed = parts[1].trim();
                    String name = parts[2].trim();
                    int birthYear = Integer.parseInt(parts[3].trim());
                    String areaAnimal = parts[4].trim();

                    Animal animal = switch (type.toLowerCase()) {
                        case "cat" -> new Cat(breed, name, birthYear);
                        case "dog" -> new Dog(breed, name, birthYear);
                        case "horse" -> new Horse(breed, name, birthYear);
                        case "alligator" -> new Alligator(breed, name, birthYear);
                        default -> throw new IllegalArgumentException("Unknown animal type: " + type);
                    };
                    for (ZooArea areaZoo : areas) {
                        if (areaAnimal.equals(areaZoo.getName())) {
                            areaZoo.addAnimal(animal);
                            break;
                        }
                    }
                    animals.add(animal);
                }
            }
        }
        return animals;
    }

    public static List<ZooArea> createZooAreasFromFile(String filename, Zoo zoo) throws IOException {
        List<ZooArea> areas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // Skip the first line
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    int maxCapacity = Integer.parseInt(parts[1].trim());
                    ZooArea area = new ZooArea(name, maxCapacity);
                    zoo.addArea(area);
                    areas.add(area);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return areas;
    }

    public static Zoo createZooFromFile(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // Skip the first line
            String line = br.readLine();
            if (line != null) {
                return new Zoo(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        throw new IOException("Zoo file is empty");
    }
}
