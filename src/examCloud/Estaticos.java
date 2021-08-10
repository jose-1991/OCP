package examCloud;

public class Estaticos {
    static {
         x= 10;

    }
    Estaticos(){
        x=5;
    }
    static int x =0;

    public static void main(String[] args) {
//        Estaticos est = new Estaticos();
        System.out.println(x);
    }
    static{
        x=12;
    }
}
