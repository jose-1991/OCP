package whizlabTest;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamMethods {
    static boolean f;
    public static void main(String[] args) throws IOException {

        assert args ==null:"Nul";
        System.out.println("OK");

        System.out.println("==========  replaceAll  ==========");
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.replaceAll(in ->in.toLowerCase());
        list.forEach(System.out::print);

        System.out.println("\n==========  reduce  ==========");
        Stream <String> str = Stream.of("2","3","4");
        System.out.println(str.reduce("1",String::concat,String::concat));

        System.out.println("==========  Path  ==========");
        Stream<Path> lista = Files.list(Paths.get("C:\\ejercicios"));
        lista.forEach(p-> System.out.print(p.getFileName()+ " | "));

        System.out.println("\n==========  Path  ==========");
        Path path3 = Paths.get("C:\\ejercicios");
        System.out.println(Files.getOwner(path3));

        System.out.println("\n==========  Path  ==========");
        Path path = Paths.get("C:\\Users\\JoSe\\Desktop");
        FileVisitor searcher = new Search();
        Files.walkFileTree(path,searcher);




    }
    private static final class Search extends SimpleFileVisitor{

        public FileVisitResult visitFile(Path file, BasicFileAttributes bfa)throws  IOException{
            Pattern p = Pattern.compile("....\\.....");
            PathMatcher pm = FileSystems.getDefault().getPathMatcher("regex:" +p);

            if (pm.matches(file.getFileName())){
                System.out.println(file);
                f=true;
            }
            return FileVisitResult.CONTINUE;
        }
    }

}
