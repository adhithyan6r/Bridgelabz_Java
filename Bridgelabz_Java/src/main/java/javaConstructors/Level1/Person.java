package javaConstructors.Level1;
// Class to create a person and copy another person's attributes
public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Person person1 = new Person("Adhi", 22);
        Person person2 = new Person(person1);
        person1.display();
        person2.display();
    }
}