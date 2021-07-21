package exception.whizlabTest;

public class Assertions {

    public static void main(String[] args){

        int num = 40;
        assert sumar(num, 6) < 45;
        System.out.print("OK");


        int j = 9;
        assert (++j>7):"Error";
        assert (j == 12): j;
        assert (++j>8):j;
        assert ( j ==12 ):new Assertions();
    }

    public static int sumar(int a, int b){
        return a+b;
    }
}
