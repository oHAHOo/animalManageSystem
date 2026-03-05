import Animal.Animal;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public List<Animal> getAnimals(){
        return animals;
    }

    public void checkAnimal(Animal animal) {
        System.out.println(
                "이름: " + animal.getName() +
                ", 나이: " + animal.getAge() +
                ", 배고픔: " + animal.getHunger() +
                ", 행복도: " + animal.getHappiness()
        );
    }
}