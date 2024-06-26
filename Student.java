package vn.viettuts;
import java.io.Serializable;
public class Student implements Serializable {
    private int id;
    private String name;
    private byte age;
    private String address;
    private float gpa;

    public Student() {
    }

public Student(int id, String name, byte age, String address, float gpa) {
    super();
    this.id = id;
    this.name = name;
    this.age = age;
    this.address = address;
    this.gpa = gpa;
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

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

public void display() {
    System.out.println("\tId: " + id);
    System.out.println("\tName: " + name);
    System.out.println("\tAge: " + age);
    System.out.println("\tAddress: " + address);
    System.out.println("\tGPA: " + gpa);
    }

public static void
    main(String[] args) {
    Student student1 = new
            Student(1, "john Doe", (byte) 30, "123 Main St", 3.8f);
    student1.display();
    }
}