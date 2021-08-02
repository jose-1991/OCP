abstract class Shape {

    Shape () {
        System.out.println ("Shape");
    }

    protected void area () {
        System.out.println ("Shape");
    }
}

class Square extends Shape {

    int side;

    Square (int side){
        this.side = side;
    }

    public void area ( ) {
        System.out.println ("Square");
    }
}

class Rectangle extends Square {

    int len, br;

    Rectangle (int x, int y) {
        super(x);
        super.side=x;
        len = x;
        br = y;
    }
    public void area ( ) {
        System.out.println ("Rectangle");
    }
}
public class Test {
}
