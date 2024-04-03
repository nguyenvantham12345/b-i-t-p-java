package BuildClass;
import java.util.scanner;
public class Person {
    protected int id;
    protected string name;
    protected int age;
    protected String address;

    public Person() {
    }

    public Person(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

public void setName(String name) {
    this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

public void display() {
        System.out.println("\tId: " + id);
        System.out.println("\tName: " + name);
        System.out.println("\tAge: " + age);
        System.out.println("\tAddress: " + address);
    }

public static void
    main(String[] args) {
        Person person1 = new
                Person(1, "john Doe", 30, "123 Main St");
        person1.display();
    }
}