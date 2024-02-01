package exception.unchecked;

/*
    @author DanujaV
    @created 2/1/24 - 11:34 AM   
*/

public class IndexOutOfBoundExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};    // 0 - 4

        System.out.println(numbers[0]); //
        System.out.println(numbers[1]); //

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("WTF!");
        }

        System.out.println("End of the program");
    }
}
