package exception.custom;

/*
    @author DanujaV
    @created 2/1/24 - 1:56 PM   
*/

import java.util.Scanner;

public class Main {
    private static void eligibleForTheVote(int age) throws AreYouCrazyException {
        if (age < 18) {
            throw new AreYouCrazyException("You are not eligible for the vote");
        } else {
            System.out.println("You are eligible for the vote");
        }
    }

    public static void main(String[] args) {
        System.out.print("Input your age: ");
        int age = new Scanner(System.in).nextInt();

        try {
            eligibleForTheVote(age);
        } catch (AreYouCrazyException e) {
            e.printStackTrace();
        }
    }
}
