import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
https://stackoverflow.com/questions/652161/how-do-i-convert-between-iso-8859-1-and-utf-8-in-java
https://howtodoinjava.com/java/io/read-file-content-into-byte-array/
 */
public class Latin1ToUtf8 {
    static final String FILE = "skandeja.txt";

    public static void main(String[] args) {
        try {
            File file = new File(FILE);
            Scanner reader = new Scanner(file);

            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("file not found");
            ex.printStackTrace();
        }
    }
}
