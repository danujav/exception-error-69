package error;

/*
    @author DanujaV
    @created 2/1/24 - 11:05 AM   
*/

class Db {
    long[] data = new long[1000000000];

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}

public class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        Db[] dbList = new Db[100000];

        for (int i = 0; i < dbList.length; i++) {
            dbList[i] = new Db();
        }
    }
}
