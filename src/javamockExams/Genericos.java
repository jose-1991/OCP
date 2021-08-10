package javamockExams;
class G<T>{
    private T t;
    public void set(T t){ this.t = t;}
    public  T get() {return t;}
}
public class Genericos {
    public static void main(String[] args) {

        G gen1 = new G();

        G<String> gen0 = new G<String>();
    }
}
