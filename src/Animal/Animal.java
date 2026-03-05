package Animal;

public abstract class Animal {
    private String name;
    private int age;
    public int hunger = 100;
    public int happiness = 0;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getHunger(){
        return hunger;
    }
    public int getHappiness(){
        return happiness;
    }

    public abstract void makeSound();
    public abstract void eat();
    public abstract void play();



}
