package InterfaceAnimal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    String name;
    List<ZooArea> areas = new ArrayList<>();

    public Zoo (String name) {
        this.name = name;
    }

    public void addArea(ZooArea area) {
        this.areas.add(area);
    }

    public String getName() {
        return name;
    }
    public List<ZooArea> getAreas(){
        return areas;
    }
}
