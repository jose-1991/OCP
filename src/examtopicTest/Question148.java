package examtopicTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Test {
    List<String> list = null;
    public void printValues(){
        System.out.println(getList());
    }

    public List<String>  getList() {
        return list;
    }
    public void setList(List<String> newList){
        list = newList;
    }
}

public class Question148 {
    public static void main(String[] args) {
        List<String> li =Arrays.asList("Dog","Cat","Mouse");
        Test t = new Test();
        t.setList(li.stream().collect(Collectors.toList()));
        t.getList().forEach(System.out::println);


        System.out.println("============= #153 ===============");
        IntStream str = IntStream.of(1,2,3,4);
        Double d = str.average().getAsDouble();
        System.out.println("Average = " + d);

    }
}
