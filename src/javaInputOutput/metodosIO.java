package javaInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class metodosIO {
    public static void main(String[] args) throws IOException {
        System.out.println("============  ReadAllLines  ============");
        List<String> stream = Files.readAllLines(Paths.get("test.txt"));
        System.out.println(stream);
//        for (String h: stream){
//            System.out.println(h);
//        }

        System.out.println("============  Input Output  ============");

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("test.txt");
            out = new FileOutputStream("dest.txt");
            int c;

            while ((c = in.read()) != -1){
                out.write(c);
            }
        }finally {
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }


    }
}
