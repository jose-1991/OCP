package manejoDeArchivos.whizlabTest;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class MetodosIOArchivos {
    public static void main(String[] args) throws IOException {

        System.out.println("=============  InputStream  =============");
        byte[] b = new byte[10];
        InputStream in = System.in;
        int i = in.read(b);

        for (byte c :b){
            System.out.print((char) c);
        }

        System.out.println("=============  Consola =============");
//        Console con = System.console();  //suponer el acceso a la consola
//        String uname = con.readLine("User Name: ");
//        char [] p = con.readPassword("Password: ");
//
//        System.out.println("Username: " + uname.toString());
//        System.out.println("Password: ");
//        for (char c : p){
//            System.out.println(c);
//        }

        String nombreArchivo = "C:\\Users\\JoSe\\Desktop\\CursoJava\\Archivo\\nuevoJava.txt";

        System.out.println("=============  ReadLine =============");
        List<String> stream = Files.readAllLines(Paths  //metodo readAllLines  devuelve una lista
                .get(nombreArchivo));

        stream.forEach(System.out::println);


        System.out.println("=============  Paths attributes =============");
        Path path = Paths.get(nombreArchivo);

        Map mp = new HashMap<String, Object>();

        mp = Files.readAttributes(path,"*");


        System.out.println(mp);

        System.out.println("=============  File.isSameFile =============");
        Path path1 = Paths.get("C:\\Users\\JoSe\\Desktop\\CursoJava\\Archivo\\nuevoJava.txt");
        Path path2 = Paths.get(nombreArchivo);  // se puede crear una ruta relativa
                                                //  con  ".\\neuvoJava.txt" solo si
                                                // el directorio de trabajo fuera el mismo

        System.out.println(Files.isSameFile(path1,path2));


        System.out.println("=============  Cargar contenido a una lista  =============");
        File f = new File(nombreArchivo);
        System.out.println(Files.readAllLines(Paths.get(f.getAbsolutePath())));



    }

}
