package exception.throwsss;

/*
    @author DanujaV
    @created 2/1/24 - 1:11 PM   
*/

import java.io.FileNotFoundException;

public class Nipun {
    public static void main(String[] args) {
//        try catch ladder
        try {
            FileReaderDemo.readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
