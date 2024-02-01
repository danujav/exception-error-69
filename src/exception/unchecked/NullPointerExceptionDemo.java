package exception.unchecked;

/*
    @author DanujaV
    @created 2/1/24 - 11:26 AM   
*/

import java.util.Scanner;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        Scanner input = null;

        System.out.print("Enter a number: ");

        try {
            int number = input.nextInt();
            System.out.println("Number: " + number);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
//            System.out.println("OOps! something happened.");
        }

        System.out.println("End of the program.");
    }
}
