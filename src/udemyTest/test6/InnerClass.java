package udemyTest.test6;

class Foo {
    public static void m1() {
        System.out.println("Foo : m1()");
    }
    class Bar {
        public void m1() {
            System.out.println("Bar : m1()");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Foo.Bar bar = foo.new Bar();
        bar.m1();
    }
}
