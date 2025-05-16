package module2.lesson05;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("text.txt"));
        outputStream.writeObject(new User("Resul", "salam1234", 20));
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("text.txt"));
        User user = (User) inputStream.readObject();
        System.out.println(user);
    }
}
