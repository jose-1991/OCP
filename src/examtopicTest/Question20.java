package examtopicTest;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question20 {
    public static void main(String[] args) {
        Path p1 = Paths.get("Java/Archivo/dest.txt");
        System.out.println(p1.getNameCount()+":"+p1.getName(2)+":"+p1.getFileName());

    }
}
