package javaNio2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class CrearLeerEscribirArchivo {
    public static void main(String[] args) throws IOException {

        String file = "C:\\Users\\JoSe\\Desktop\\CursoJava\\IdeaProjects\\OCP\\emptyFile.txt";
        System.out.println("============ crear en un archivo ==========");


        Path emptyFile = Paths.get(file);
        if (Files.notExists(emptyFile)){
            emptyFile=Files.createFile(Paths.get(file));
        }

        System.out.println("============ escribir en un archivo ==========");

        String text = "Esto es una cadena de prueba";
        Files.write(Paths.get("emptyFile.txt"),text.getBytes(StandardCharsets.UTF_8),StandardOpenOption.CREATE,StandardOpenOption.TRUNCATE_EXISTING);


        System.out.println("============ Tamaño del directorio en bytes ==========");
        long size = Files.walk(Paths.get(file)).parallel().filter(p -> p.toFile().isFile())
                .mapToLong(p -> p.toFile().length()).sum();
        System.out.println("Tamaño del directorio: " + size);

        System.out.println("============ leer el archivo ==========");
        List<String> lines = Files.readAllLines(Paths.get(file),
                StandardCharsets.UTF_8);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
