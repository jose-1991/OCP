package examtopicTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question80 {
    public static void main(String[] args) throws IOException {
        BufferedReader brCpy = null;
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            br.lines().forEach(System.out::println);
            brCpy = br;
        }
//        brCpy.ready();
    }
}
