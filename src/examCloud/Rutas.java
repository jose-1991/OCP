package examCloud;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Rutas {
    public static void main(String[] args) {
        Path path = Paths.get("test.txt");
        try {
            List<String> list = Files.readAllLines(path);
            list.stream().forEachOrdered(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
