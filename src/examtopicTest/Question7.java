package examtopicTest;

import java.util.function.Supplier;

class Bird{
    public void fly(){
        System.out.println("Can fly");
    }
}
class Penguin extends Bird{
    public void fly(){
        System.out.println("Cannot fly");
    }
}

public class Question7 {
    public static void main(String[] args) {
        fly(() -> new Bird());
        fly(Penguin::new);

    }
    static void fly(Supplier<Bird> bird){
        bird.get().fly();
    }
}

