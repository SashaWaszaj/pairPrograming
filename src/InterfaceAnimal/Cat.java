package InterfaceAnimal;

import java.util.Date;

public class Cat implements Animal {
    private String species = "Gato";
    private String breed;
    private String name;
    private int birthYear;

    public Cat(String breed, String name, int birthYear ) {
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
        return "Animal: "+ species+ ", breed: " + breed + ", name: " + name+ ", edad: " + this.getAge();
    }

    @Override
    public int getAge() {
        return new Date().getYear() + 1900 - birthYear ;
    }
}
