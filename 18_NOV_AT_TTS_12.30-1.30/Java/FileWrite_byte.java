import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite_byte {
    public static void main(String[] args) throws Exception {
        FileOutputStream dharmishtha = new FileOutputStream("file1.txt");
        Scanner obj = new Scanner(System.in);
        String str = "";
        while (true) {
            str = obj.next();
            if (str.equals("END"))
                break;
            str += "\t";
            byte b[] = str.getBytes();
            dharmishtha.write(b);
        }

        System.out.println("Data written");

    }
}
