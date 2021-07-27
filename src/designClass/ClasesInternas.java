package designClass;

public class ClasesInternas {

    public static void main(String[] args) {
        ClasesInternas.Inner in =new ClasesInternas().new Inner();
        in.y = 10;
        in.print();

    }
    class Inner{
        private int y = 0;
        public void print(){
            System.out.println(y);
        }
    }
}
