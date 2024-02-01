package error;

/*
    @author DanujaV
    @created 2/1/24 - 10:59 AM   
*/

public class StackOverFlowErrorDemo {
    private static void myMethod() {
        System.out.println("Start my method");

        myMethod();

        System.out.println("End my method");
    }

    public static void main(String[] args) {
        System.out.println("Start main");
        myMethod();

        System.out.println("End main");
    }
}
