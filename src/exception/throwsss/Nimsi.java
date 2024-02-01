package exception.throwsss;

/*
    @author DanujaV
    @created 2/1/24 - 1:14 PM   
*/

import java.io.FileNotFoundException;

public class Nimsi {
    public static void main(String[] args) {
        try {
            FileReaderDemo.readFile();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
