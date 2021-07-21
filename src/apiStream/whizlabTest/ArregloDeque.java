package apiStream.whizlabTest;

import java.util.ArrayDeque;

public class ArregloDeque {
    public static void main(String[] args) {

        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.add("a");
        dq.add("c");
        dq.add("b");
        dq.add("a");
        dq.removeLastOccurrence("a");

        System.out.println(dq);
    }
}
