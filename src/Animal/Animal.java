public abstract class Animal {
    String name;
    int age;
    int hunger;
    int happiness;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void getName();
    abstract void makeSound();
    abstract void eat();
    abstract void play();

}
