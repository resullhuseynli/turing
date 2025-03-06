package module2.lesson02;

public class Person {

    private String name;

    private Integer age;

    private String gender;

    public String getGender() {
        return gender;
    }

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

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
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }  else {
            this.age = age;
        }
    }
}
