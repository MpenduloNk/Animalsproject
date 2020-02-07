import java.util.ArrayList;
public class Home {
    ArrayList<Animal> name = new ArrayList();

    public void adoptPet(Animal animal){
        name.add(animal);
    }

    public void makeAllSounds(){
        for(Animal object: name){
            object.sound();
        }
    }
}

