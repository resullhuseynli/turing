package module2.lesson07;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("test.txt",true)) {

            for(int i=0;i<10;i++) {
                User user = new User(i, "Salam");
                fw.write(user.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}