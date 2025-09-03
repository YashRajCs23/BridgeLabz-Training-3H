package Constructor.Level 1.Person;
public class PersonMain {
    
    public static void main(String[] args) {
        System.out.println("\n=== Person Class ===");
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person(p1); // copy constructor
        p1.display();
        p2.display();
    }
}