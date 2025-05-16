package module2.lesson04;

import java.io.FileReader;
import java.io.IOException;

public class FilesReaderDemo {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("text.txt");
        int read = fileReader.read();
        while (read != -1) {
            System.out.print((char) read);
            read = fileReader.read();
        }
    }
}
