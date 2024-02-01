package exception.thorww;

/*
    @author DanujaV
    @created 2/1/24 - 1:38 PM   
*/

import java.util.Scanner;

public class ThrowDemo {
    private static void eligibleForTheVote(int age) {
        if(age < 18) {
            throw new ArithmeticException("Invalid age!");
//            System.out.println("You are not eligible for the vote");
        } else {
            System.out.println("You are eligible for the vote");
        }
    }

    public static void main(String[] args) {
        System.out.print("Input your age: ");
        int age = new Scanner(System.in).nextInt();

        try {
            eligibleForTheVote(age);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
