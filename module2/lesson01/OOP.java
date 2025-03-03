package module2.lesson01;

public class OOP {
    public static void main(String[] args) {

        Student student = new Student();
        student.setAge(19);
        student.setName("Aydin");
        System.out.println(student);

        Student student2 = new Student();
        student2.setAge(20);
        student2.setName("Rasul");
        System.out.println(student2);

        Student student3 = new Student("Serkan", 20);
        System.out.println(student3);

        System.out.println(addNumber(1,2));
    }

    public static int addNumber(int a, int b) {
        int sum = a + b;
        return a + b;
    }

    public int addNumber(int a, int b, int c) {
        int sum = addNumber(a, b);
        return sum + c;
    }
}
