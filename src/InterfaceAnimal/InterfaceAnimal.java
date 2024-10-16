package InterfaceAnimal;

public class InterfaceAnimal {
    public static void prueba() {
        Zoo botanico = new Zoo("botanico");
        ZooArea felinos = new ZooArea("felinos", 2);
        ZooArea reptiles = new ZooArea("reptiles", 3);
        ZooArea mamiferos = new ZooArea("mamiferos", 4);
        ZooArea aves = new ZooArea("aves", 2);

        botanico.addArea(felinos);
        botanico.addArea(reptiles);
        botanico.addArea(mamiferos);

        Animal cat = new Cat("carey", "Micha", 2022);
        System.out.println(cat.toString());
        felinos.addAnimal(cat);

        Animal ostrich = new ostrich ("african", "speedy");
        system.out.println(ostrich.tostring());
        aves.addAnimal(ostrich);

        Animal lionCat = new Cat("africano", "Simba", 2022);
        System.out.println(lionCat.toString());
        felinos.addAnimal(lionCat);

        Animal tigerCat = new Cat("striped", "Tiger", 2020);
        System.out.println(tigerCat.toString());
        felinos.addAnimal(tigerCat);

        Animal horse = new Horse("arabe", "Tiro al blanco", 2015);
        System.out.println(horse.toString());
        mamiferos.addAnimal(horse);

        Animal dog = new Dog("delmer", "Firulais", 2019);
        System.out.println(dog.toString());
        mamiferos.addAnimal(dog);

        Animal alligator = new Alligator("americano", "Snappy", 2010);
        System.out.println(alligator.toString());
        reptiles.addAnimal(alligator);

        System.out.println(felinos.toString());
        System.out.println(mamiferos.toString());
        System.out.println(reptiles.toString());

        int numeroAnimales = 1;
        System.out.println("Areas con mayor a " + numeroAnimales + " de numero de animales");
        botanico.getAreas().stream().filter(area -> area.getNumberOfAnimals() > numeroAnimales).forEach(area -> {
            System.out.println(area.toString());
        });
    }
}
