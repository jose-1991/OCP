package estructuraDeDatos.whizlabTest;

import java.util.SortedMap;
import java.util.TreeMap;

public class MetodosTreeMap {
    public static void main(String[] args) {
        TreeMap<String,String> map = new TreeMap<>();
        map.put("a","apple");
        map.put("e", "egg");
        map.put("g", "gear");

        SortedMap<String,String> smap = map.subMap("a","g");
        smap.put("b","ball");
        smap.put("f","fish");
        map.put("c","cat");
        map.remove("a");

        System.out.println(smap);
        System.out.println(map);

    }
}
