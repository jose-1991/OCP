package manejoDeArchivos;

import manejoDeArchivos.servicio.ArchivoServicio;

public class CrearEscribirArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\JoSe\\Desktop\\CursoJava\\Archivo\\nuevoJava.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo2(nombreArchivo);
    }

}
