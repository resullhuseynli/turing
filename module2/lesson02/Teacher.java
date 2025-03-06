package module2.lesson02;

public class Teacher extends Person {

    private String subject;

    private Integer salary;

    public Teacher(String name, int age, String gender, String subject, Integer salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
