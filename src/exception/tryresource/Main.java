package exception.tryresource;

/*
    @author DanujaV
    @created 2/1/24 - 2:20 PM   
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //resource
        Integer integer = new Integer(10);  //not a resource

        System.out.print("Input num1: ");
        int i = input.nextInt();

        input.close();  //close

        System.out.print("Input num2: ");
        int i2 = input.nextInt();

//        integer.close();    //?
    }
}
