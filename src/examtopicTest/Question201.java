package examtopicTest;
class Empe{
    public void calcLeave(){
        System.out.println("12");
    }
}
public class Question201 {
    public static void main(String[] args) {
        Empe e =new Empe(){
            public void calcLeave(){
                System.out.println("13");
            }
        };
        e.calcLeave();


    }
}
