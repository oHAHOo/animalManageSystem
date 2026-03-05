package Animal;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("야옹!");
    }
    @Override
    public void eat() {
        hunger=hunger-1;
    }
    @Override
    public void play() {
        happiness=happiness+1;
    }

}
