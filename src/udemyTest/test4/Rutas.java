package udemyTest.test4;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Rutas {
    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add(1);
        list.add("2");
        list.forEach(System.out::print);
    }
}
