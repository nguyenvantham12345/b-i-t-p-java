package vn.viettuts;
import java.io.Serializable;

public class Teacher implements Serializable {
    private int id;
    private String name;
    private byte age;
    private String address;
    private String subject;

    public Teacher() {
    }

public Teacher(int id, String name, byte age, String address, String subject) {
    super();
    this.id = id;
    this.name = name;
    this.age = age;
    this.address = address;
    this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

public void display() {
    System.out.println("\tId: " + id);
    System.out.println("\tName: " + name);
    System.out.println("\tAge: " + age);
    System.out.println("\tAddress: " + address);
    System.out.println("\tSubject: " + subject);
}

    public static void main(String[] args) {
        // Example usage
        Teacher teacher1 = new Teacher(1, "Jane Smith", (byte) 40, "456 Oak St", "Mathematics");
        teacher1.display();
    }
}
    }
}