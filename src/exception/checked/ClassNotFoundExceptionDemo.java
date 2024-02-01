package exception.checked;

/*
    @author DanujaV
    @created 2/1/24 - 11:52 AM   
*/

public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            Class.forName(Student.class.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Student class not found");
        }
    }
}
