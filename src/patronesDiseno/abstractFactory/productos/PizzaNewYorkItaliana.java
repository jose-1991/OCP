package patronesDiseno.abstractFactory.productos;

public class PizzaNewYorkItaliana extends PizzaProducto {
    public PizzaNewYorkItaliana(){
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate italiano con carne";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamon");
        ingredientes.add("Choricillo");
        ingredientes.add("Champiñones");
    }
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min. a 120 *C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando en triangulos grandes");

    }
}
