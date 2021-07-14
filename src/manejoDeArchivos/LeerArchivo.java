package manejoDeArchivos;

import manejoDeArchivos.servicio.ArchivoServicio;

public class LeerArchivo {

    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\JoSe\\Desktop\\CursoJava\\Archivo\\nuevoJava.txt";


        ArchivoServicio service = new ArchivoServicio();
        System.out.println(service.leerArchivo2(nombreArchivo));
    }
}
