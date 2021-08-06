package examtopicTest;

import whizlabTest.StreamMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Question191 {
    public static void main(String[] args) throws IOException {
        Stream<Path> files = Files.list(Paths.get(System.getProperty("user.home")));
        files.forEach(fname -> {
            try {
                Path apath = fname.toAbsolutePath();
                System.out.println(fname + ":" + Files.readAttributes(apath, BasicFileAttributes.class).creationTime());

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

    }
}

