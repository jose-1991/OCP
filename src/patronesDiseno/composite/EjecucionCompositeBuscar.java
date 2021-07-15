package patronesDiseno.composite;

public class EjecucionCompositeBuscar {
    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");
        Directorio stream = new Directorio("Api_Stream_Java");

        java.addComponente(new Archivo("patron-composite.docx"));
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpeg"));

        //System.out.println(doc.mostrar(0));
        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("encontrado patron-composite.docx: "+ encontrado);

        encontrado = doc.buscar("Api Stream");
        System.out.println("encontrado Api Stream: "+ encontrado);

        encontrado = doc.buscar("logo.jpeg");
        System.out.println("encontrado logo.jpeg: "+ encontrado);
    }
}
