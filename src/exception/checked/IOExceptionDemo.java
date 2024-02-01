package exception.checked;

/*
    @author DanujaV
    @created 2/1/24 - 11:47 AM   
*/

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOExceptionDemo {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("abc.txt");  // checked exception
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
