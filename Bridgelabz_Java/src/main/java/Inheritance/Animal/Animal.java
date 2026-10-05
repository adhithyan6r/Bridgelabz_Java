package Inheritance.Animal;
// Class to represent the common properties and behavior of all animals
public class Animal {
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}