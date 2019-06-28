import java.io.Serializable;

public class Person implements Serializable {
    private  String name;
    private int age;
    public Person (String name, int age) {
        this.age = age;
        this.name = name;
    }
}
