package udemyTest.test5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Rutas {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\JoSe\\Desktop\\CursoJava\\Archivo\\text.txt");
        long size1 = Files.size(path);

        File file = new File("C:\\Users\\JoSe\\Desktop\\CursoJava\\Archivo\\text.txt");
        long size2 = file.length();

        System.out.println(size1+" : "+size2);

        System.out.println(size1 == size2);
    }
}
