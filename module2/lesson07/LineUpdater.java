package module2.lesson07;

import java.io.IOException;
import java.io.RandomAccessFile;

public class LineUpdater {
    public static void main(String[] args) {

        try (RandomAccessFile randomAccessFile = new RandomAccessFile("test.txt", "rw")) {

            long position = 0;
            String line;
            while ((line = randomAccessFile.readLine()) != null) {
                position = randomAccessFile.getFilePointer();
                if (line.charAt(3) == '7') {
                    break;
                }
            }
            if (line == null) {
                throw new RuntimeException("User Not Found!");
            }
            randomAccessFile.seek(position);
            randomAccessFile.writeBytes("id=11, 'name=Rasul");

        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
