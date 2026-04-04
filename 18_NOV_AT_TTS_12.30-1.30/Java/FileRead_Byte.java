import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead_Byte {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Documents\\Java_Backup.txt");
        int i = fis.read();
        while (i != -1) {
            System.out.print((char) i);
            i = fis.read();
        }

    }
}
