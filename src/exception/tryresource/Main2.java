package exception.tryresource;

/*
    @author DanujaV
    @created 2/1/24 - 2:20 PM   
*/

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {   //try with resource block
            System.out.print("Input num1: ");
            int i = input.nextInt();
        }
    }
}
