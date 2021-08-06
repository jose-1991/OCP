package examtopicTest;
class Birds{
    String name;

    public Birds(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
}
interface BirdInt{
    Birds getBird(String name);
}
public class Question200 {
    public static void main(String[] args) {
        BirdInt b1 = s->new Birds("Peacock");
        Birds b = b1.getBird("Peacock");
        b.eat();
    }
}
