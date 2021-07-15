package patronesDiseno.composite;

public class Archivo extends Componente{

    public Archivo(String nombre) {
        super(nombre);
    }

    @Override
    public String mostrar(int nivel) {
        String tab = "";
        for (int i = 0; i<nivel;i++){
            tab += "\t";
        }
        return tab + getNombre();
    }

    @Override
    public boolean buscar(String nombre) {
        return this.nombre.equalsIgnoreCase(nombre);
    }
}
