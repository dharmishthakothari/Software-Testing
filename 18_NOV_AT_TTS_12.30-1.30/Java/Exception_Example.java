import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_Example {
    public static void main(String[] args) throws FileNotFoundException {
        // try {
        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Documents\\Jira_notes.txt");
        // } catch (FileNotFoundException e) {
        // System.out.println("in catch block ");
        // }

    }
}
