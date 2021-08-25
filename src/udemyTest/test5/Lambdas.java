package udemyTest.test5;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@FunctionalInterface
interface I4 {
    void print();
    boolean equals(Object obj);
}
public class Lambdas {
    public static void main(String[] args) {

        System.out.println("=========  Lambda =========");
        I4 obj = () -> System.out.println("Lambda expression");
        obj.print();
        IntStream.iterate(1, i -> i + 1).limit(11)
                .filter(i -> i % 2 != 0).forEach(System.out::print);

        System.out.println("=========  Scanner =========");

//        System.out.print("Enter some text: ");
//        try(Scanner scan = new Scanner(System.in)) {
//            String s = scan.nextLine();
//            System.out.println(s);
//            scan.nextLine();
//            scan.close();
//
//        }

        System.out.println("=========  Funtion  =========");
        Function<char [], String> obj1 = String::new; //Line 5
        String s = obj1.apply(new char[] {'j', 'a', 'v', 'a'}); //Line 6
        System.out.println(s);

        System.out.println("=========  IntStream  =========");
        System.out.println(IntStream.range(-10, -10).count());
        System.out.println(IntStream.rangeClosed(-10, -10).count());

        System.out.println("=========  Random  =========");
        IntStream stream = new Random().ints(1, 7).limit(2);
        System.out.println(stream.max().getAsInt());



    }
}
