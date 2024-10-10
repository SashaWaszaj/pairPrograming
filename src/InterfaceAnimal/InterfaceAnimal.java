package InterfaceAnimal;

public class InterfaceAnimal {
    public static void prueba(){


        Zoo botanico = new Zoo("botanico");
        ZooArea felinos = new ZooArea("felinos", 2);
        ZooArea reptiles = new ZooArea("reptiles", 3);

        botanico.addArea(felinos);
        botanico.addArea(reptiles);


        Animal cat = new Cat("carey", "micha", 2022);
        System.out.println(cat.toString());
        felinos.addAnimal(cat);

        Animal lionCat = new Cat("africano", "Simba", 2022);
        System.out.println(lionCat.toString());
        felinos.addAnimal(lionCat);

        Animal tigerCat = new Cat("striped", "Tiger", 2020);
        System.out.println(tigerCat.toString());
        felinos.addAnimal(tigerCat);

        System.out.println(felinos.toString());


        int numeroAnimales = 1;
        System.out.println("Areas con mayor a " + numeroAnimales+" de numero de animales");

        botanico.getAreas().stream().filter(area -> area.getNumberOfAnimals() > numeroAnimales).forEach(area->{
            System.out.println(area.toString());
        });
    }
}
