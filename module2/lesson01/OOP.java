package module2.lesson01;

public class OOP {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "John";
        student.age = 20;

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println(student);
    }
}
