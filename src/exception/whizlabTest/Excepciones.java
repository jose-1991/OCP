package exception.whizlabTest;

public class Excepciones {
    public static void main(String[] args) {
        try(Resource r = new Resource()){
            System.out.print("1");
            throw new RuntimeException();

        }
    }
}

class Resource implements AutoCloseable{

    @Override
    public void close(){
        System.out.println("closed");
    }
}
