package patronesDiseno.decorator.productosCafe;

public class Cafe implements Configurable{
    private float Precio;
    private String nombre;

    public Cafe( String nombre,float precio) {
        this.Precio = precio;
        this.nombre = nombre;
    }

    @Override
    public float getPrecioBase() {
        return this.Precio;
    }

    @Override
    public String getIngredientes() {
        return this.nombre;
    }
}
