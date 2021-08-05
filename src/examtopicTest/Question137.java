package examtopicTest;

import java.io.*;

public class Question137 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test.txt");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr);){

            if (br.markSupported()){
                System.out.println((char) br.read());
                br.mark(2);
                System.out.println((char) br.read());
                br.reset();
                System.out.println((char) br.read());

            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
