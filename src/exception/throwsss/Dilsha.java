package exception.throwsss;

/*
    @author DanujaV
    @created 2/1/24 - 1:16 PM   
*/

import java.io.FileNotFoundException;

public class Dilsha {
    public static void main(String[] args) {
        try {
            FileReaderDemo.readFile();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
