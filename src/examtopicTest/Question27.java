package examtopicTest;
enum USCurrency{
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);

    private  int value;
    private USCurrency(int value){
        this.value =value;
    }

    public int getValue() {
        return value;
    }
}
public class Question27 {
    public static void main(String[] args) {
        USCurrency usCoin = USCurrency.DIME;
        System.out.println(usCoin.getValue());
    }

}
