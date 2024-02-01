package exception.throwsss;

/*
    @author DanujaV
    @created 2/1/24 - 1:07 PM   
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {   //Danuja
    static void readFile() throws FileNotFoundException, ClassNotFoundException {
        FileReader fr = new FileReader("abc.txt");

        Class.forName("Student");
    }
}
