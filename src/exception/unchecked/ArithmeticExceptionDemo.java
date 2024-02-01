package exception.unchecked;

/*
    @author DanujaV
    @created 2/1/24 - 11:10 AM   
*/

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int n1 = 10;
        System.out.print("Enter a number: ");
        int n2 = new Scanner(System.in).nextInt();


        int result = n1 / n2;   //ArithmeticException
        System.out.println("Result: " + result);


        System.out.println("End of program.");
    }
}
