package exception.finallyy;

/*
    @author DanujaV
    @created 2/1/24 - 2:10 PM   
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1 = 10;

        System.out.println("Input n2: ");
        int n2 = new Scanner(System.in).nextInt();

        try {
            int result = n1 / n2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("catch block");
        } finally {
            System.out.println("whatever happened, this block don't care");
        }
    }
}
