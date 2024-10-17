package FileReaderAnimal;

import InterfaceAnimal.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileAnimalCreator {

    public ArrayList<Zoo> parseAnimalEtAl(String filePath) throws IOException {
        ArrayList<Zoo> zoos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            Zoo currentZoo = null;
            ZooArea currentArea = null;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                switch (parts[0].trim().toLowerCase()) {
                    case "zoo" -> {
                        // Create a zoo
                        currentZoo = new Zoo(parts[1]);
                        zoos.add(currentZoo);
                    }
                    case "area" -> {
                        // Create the area
                        currentArea = new ZooArea(parts[1], Integer.parseInt(parts[2]));
                        if (currentZoo == null) {
                            throw new IllegalArgumentException("Zoo is null on line: " + line);
                        }
                        currentZoo.addArea(currentArea);
                    }
                    case "animal" -> {
                        String type = parts[1].trim();
                        String breed = parts[2].trim();
                        String name = parts[3].trim();
                        int birthYear = Integer.parseInt(parts[4].trim());

                        Animal animal = switch (type.toLowerCase()) {
                            case "cat" -> new Cat(breed, name, birthYear);
                            case "dog" -> new Dog(breed, name, birthYear);
                            case "horse" -> new Horse(breed, name, birthYear);
                            case "alligator" -> new Alligator(breed, name, birthYear);
                            default -> throw new IllegalArgumentException("Unknown animal type: " + type);
                        };

                        if (currentArea == null) {
                            throw new IllegalArgumentException("Area is null on line: " + line);
                        }

                        currentArea.addAnimal(animal);
                    }
                    default -> throw new IllegalArgumentException("Unknown entry type: " + parts[0]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return zoos;
    }
}
