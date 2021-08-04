package examtopicTest;

import java.util.Arrays;
import java.util.List;

class Resource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Close-");
    }
    public void open(){
        System.out.println("Open-");
    }
}
public class Question99 {
    public static void main(String[] args) {
        Resource res1 = new Resource();
        try {
            res1.open();
            res1.close();
        }catch (Exception e) {
            System.out.println("Exception - 1");
        }
        try (Resource res2 = new Resource()){ // solo nueva instancia
            res2.open();                      // res1 = new Resource()  => Error Compilacion

        }catch (Exception e){
            System.out.println("Exception - 2");
        }



        System.out.println("============= #100 ============");
        List<String> cs = Arrays.asList("Java","Java EE", "Java ME");
        boolean b = cs.stream().allMatch(w ->w.equals("Java"));
        System.out.println(b);
    }
}
