package examtopicTest;


import java.io.Console;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

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

        System.out.println("============= #101 ============");
        final String str1 = "Java";
        StringBuffer strBuf = new StringBuffer("Course");
        UnaryOperator<String> u =(str2) ->str1.concat(str2);
        UnaryOperator<String> c = str3 ->str3.toLowerCase();
        System.out.println(u.apply(c.apply("Course")));    // requiere: String    provides: StringBuffer

        System.out.println("============= #107 ============");
        Console consola = System.console();
        String pass = consola.readLine("Enter Password: ");    //exception
        String password = new String(pass);
        System.out.println(password);

    }
}
