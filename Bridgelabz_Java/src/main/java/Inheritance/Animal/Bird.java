package Inheritance.Animal;
// Class to represent a bird that inherits from Animal
public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("chirps");
    }
}