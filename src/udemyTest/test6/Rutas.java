package udemyTest.test6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Rutas {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:", "examples", "B", "File.txt");
        Files.createDirectories(path.getParent());
        Files.createFile(path);
    }
}
