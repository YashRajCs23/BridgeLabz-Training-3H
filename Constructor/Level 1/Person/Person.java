package Constructor.Level 1.Person;
public class Person {
    
    String name;
    int age;
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}