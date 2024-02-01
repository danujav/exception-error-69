package exception.unchecked;

/*
    @author DanujaV
    @created 2/1/24 - 11:40 AM   
*/

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String n1 = "10";
        String n2 = "abc";

        int tot = 0;
        try {
            tot = Integer.parseInt(n1) + Integer.parseInt(n2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
        System.out.println("Total: " + tot);

        System.out.println("End of program");
    }
}
