package exception.throwsss;

/*
    @author DanujaV
    @created 2/1/24 - 1:11 PM   
*/

import java.io.FileNotFoundException;

public class Nipun {
    public static void main(String[] args) {
        try {
            FileReaderDemo.readFile();
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
