package udemyTest.test4;

import java.util.LinkedHashMap;
import java.util.Map;

public class lambdas {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(null, "zero");
        map.put(1, "one");

        System.out.println(map);
    }

}
