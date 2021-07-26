package estructuraDeDatos.whizlabTest;


import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MetodosTreeMap {
    public static void main(String[] args) {

        System.out.println("=============  SortedMap =============");
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

        System.out.println("=============  ReplaceALL =============");
        Map<String ,Integer> tmap = new TreeMap<>();
        tmap.put("ab",1);
        tmap.put("abc",2);
        tmap.put("abcd",3);
        tmap.replaceAll((k,v) -> (int)k.charAt(v));
        System.out.println(tmap.values());

        System.out.println("============  Replace  ============");
        Map<Integer,String> map2 = new TreeMap<>();

        map2.put(1,"One");
        map2.put(2,"Two");
        map2.put(3,"Three");

        map2.replace(1,"1",null);
        map2.replace(3,null);
        System.out.println(map2.values());

    }
}
