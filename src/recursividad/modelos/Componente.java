package recursividad.modelos;

import java.util.List;

public class Componente {

    private String nombre;
    private List<Componente> hijos;

    public Componente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Componente> getHijos() {
        return hijos;
    }

    public void setHijos(List<Componente> hijos) {
        this.hijos = hijos;
    }

    public Componente addComponente(Componente c){
        this.hijos.add(c);
        return this;
    }

    public boolean tieneHijos(){
        return !this.hijos.isEmpty();
    }
}
