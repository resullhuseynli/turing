package module2.lesson02;

public class Student extends Person {

    private Double gpa;

    public Student(String name, int age, String gender, Double gpa) {
        super(name, age, gender);
        this.gpa = gpa;
    }

    public Student() {
    }


    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
}
