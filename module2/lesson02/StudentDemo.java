package module2.lesson02;

public class StudentDemo {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Aydin");
        student.setAge(19);
        student.setGender("Male");

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());


    }
}
