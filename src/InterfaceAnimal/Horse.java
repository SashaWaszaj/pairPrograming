package InterfaceAnimal;

import java.time.LocalDate;

public class Horse implements Animal {
    private String species = "Caballo";
    private String breed;
    private String name;
    private int birthYear;

    public Horse(String breed, String name, int birthYear) {
        this.breed = breed;
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public String getSpecie() {
        return this.species;
    }

    @Override
    public String getBreed() {
        return this.breed;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getBirthYear() {
        return this.birthYear;
    }

    @Override
    public String toString() {
        return "Animal: " + species + ", breed: " + breed + ", name: " + name + ", edad: " + this.getAge();
    }

    @Override
    public int getAge() {
        return LocalDate.now().getYear() - birthYear; // Updated to use LocalDate
    }
}