package module2.lesson04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("text.txt", true);
        fileWriter.write("Hello World 2");
        fileWriter.close();

    }
}
