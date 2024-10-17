package FileReaderAnimal;

import InterfaceAnimal.Zoo;
import InterfaceAnimal.ZooArea;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderAnimalMain {
    public static void prueba() {
        try {
            System.out.println("-----------------------------------");
            System.out.println("Comienzo de FileAnimalCreator");
            FileAnimalCreator fileAnimalCreator = new FileAnimalCreator();
            ArrayList<Zoo> zoos = fileAnimalCreator.parseAnimalEtAl("src/FileReaderAnimal/animalEtAl.csv");

            for (Zoo zoo : zoos) {
                System.out.println("----------------inputs-------------------");
                System.out.println("Zoo: " + zoo.getName());
                for (ZooArea area : zoo.getAreas()) {
                    System.out.println(area.toString());
                }
            }

            int umbralAnimales = 2;
            System.out.println("-----------------stream------------------");
            System.out.println("Areas con mayor a " + umbralAnimales + " de numero de animales");
            for (Zoo zoo : zoos) {
                System.out.println("Zoo: " + zoo.getName());
                zoo.getAreas().stream().filter(area -> area.getNumberOfAnimals() > umbralAnimales).forEach(area -> {
                    System.out.println(area.toString());
                });
            }

        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}
