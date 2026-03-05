package Animal;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
    @Override
    public void eat() {
        hunger=hunger-2;
    }
    @Override
    public void play() {
        happiness=happiness+2;
    }
}
