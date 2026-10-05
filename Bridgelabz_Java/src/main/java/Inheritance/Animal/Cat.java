package Inheritance.Animal;
// Class to represent a cat that inherits from Animal
public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("meows");
    }
}