package udemyTest.test4;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Rutas {
    public static void main(String[] args) {
        Path path = Paths.get("F:\\A\\B\\C\\Book.java");
        System.out.println(path.subpath(1,5));
    }
}
