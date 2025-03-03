package module2.lesson01;

public class Student {

    public Student() {
        id++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        id++;
    }

    /* public Student(String name) {
        this(name, 18); // This is a constructor call. It is used to call the constructor of the same class.
    }*/

    private static Long id=0L;
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" ;
    }
}
