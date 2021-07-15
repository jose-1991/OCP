package patronesDiseno.abstractFactory.productos;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana(){
        nombre = "Pizza vegetariana New York";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinaca");
        ingredientes.add("Berenjenas");

    }
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 150 *C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando en rebanadas cuadradas..");

    }
}
