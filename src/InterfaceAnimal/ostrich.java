package InterfaceAnimal;

import java.time.LocalDate;

public class Ostrich implements Animal {
    private String species = "Avestruz"; // Ostrich in Spanish
    private String breed;
    private String name;
    private int birthYear;

    public Ostrich(String breed, String name, int birthYear) {
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
        return LocalDate.now().getYear() - birthYear; // Calculate age using current year
    }
}
