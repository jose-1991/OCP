package examtopicTest;

import java.util.function.DoubleSupplier;

class Job{
    String name;
    Integer cost;

    public Job(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}
public class Question92 {
    public static void main(String[] args) {
        Job j1 = new Job("IT",null);
        DoubleSupplier js1 = j1::getCost;
        System.out.println(j1.getName() +":"+js1.getAsDouble());
    }

}
