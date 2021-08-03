package examtopicTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Producto{
    int id, price;

    public Producto(int id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", price=" + price;
    }
}
public class Question36 {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1,10));
                productos.add(new Producto(2,20));
                productos.add(new Producto(2,30));

        Producto p = productos.stream().reduce(new Producto(4,0),(p1,p2)->{
            p1.price+=p2.price;
            return new Producto(p1.id, p1.price);
        });
        System.out.println(p);
        productos.add(p);
        productos.stream().parallel().reduce((p1,p2)-> p1.price > p2.price?p1:p2)
                .ifPresent(System.out::println);
    }
}
