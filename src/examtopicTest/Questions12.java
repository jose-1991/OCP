package examtopicTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Questions12 {
    public static void main(String[] args) throws IOException {

        System.out.println("=========== Question #13 ==========");
        Path file = Paths.get("dest.txt");
        Stream<String> fc = Files.lines(file);
        fc.forEach(System.out::println);

        List<String> ls = Files.readAllLines(file);
        ls.forEach(System.out::println);
    }
}
