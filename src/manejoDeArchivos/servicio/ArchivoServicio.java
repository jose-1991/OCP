package manejoDeArchivos.servicio;

import java.io.*;
import java.util.Scanner;


public class ArchivoServicio {

    public void crearArchivo(String nombre) {
        File archivo = new File(nombre);


        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))) {

            buffer.append("Hola, que tal amigos!\n")
                    .append("Todo bien? yo ando escrbiendo en un archivo\n")
                    .append("Hasta luego bobys!\n");
            // buffer.close();
            System.out.println("el archivo se creo con exito");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void crearArchivo2(String nombre) {
        File archivo = new File(nombre);


        try (PrintWriter print = new PrintWriter(new FileWriter(archivo, true))) {

            print.println("Hola, que tal amigos!\n");
            print.println("Todo bien? yo ando escrbiendo en un archivo\n");
            print.println("Hasta luego bobys!\n");
            // buffer.close();
            System.out.println("el archivo se creo con exito");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while((linea = reader.readLine()) != null){
                sb.append(linea).append("\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);

        try(Scanner s = new Scanner(archivo))  {

            s.useDelimiter("\n");
            while(s.hasNext()){
                sb.append(s.next()).append("\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
