package examtopicTest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

class Product{
    String name;
    int qty;
    public String toString(){
        return name;
    }

    public Product(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }
    static class ProductFilter{
        public static boolean isAvailable(Product p){
            return p.qty>=10;
        }
    }
}
public class Question87 {
    public static void main(String[] args) {
        List<Product> produtcs = Arrays.asList(
                new Product("MotherBoard",5),
                new Product("Speaker", 20));

        produtcs.stream().filter(Product.ProductFilter::isAvailable)
                .forEach(p -> System.out.println(p));


        System.out.println("============= #91 ============");
        try {
            List<String> content = Files.readAllLines(Paths.get("data.txt"));
            content.stream().forEach(line -> {
                try{
                    Files.write(
                            Paths.get("dest.txt"),
                            line.getBytes(),
                            StandardOpenOption.APPEND
                    );
                }catch (IOException e){
                    System.out.println("Exception 1");
            }});
        }catch (IOException e){
            System.out.println("Exception 2");
        }
    }
}
