package udemyTest.test6;

class Resource implements AutoCloseable {
    public void close() {
        System.out.println("CLOSE");
    }
}
public class Test1 {
    public static void main(String[] args) {
        try(Resource r = null) {
            System.out.println("HELLO");
        }

    }
}
