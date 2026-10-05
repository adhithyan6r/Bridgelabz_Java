package Inheritance.Animal;
// Class to run the animal hierarchy program and demonstrate polymorphism
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Tony", 5),
                new Cat("poona", 1),
                new Bird("chuck", 3)
        };
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name);
            System.out.println("Age: " + animal.age);
            animal.makeSound();
            System.out.println();
        }
    }
}