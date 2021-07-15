package patronesDiseno.factory.productos;

public class PizzaCaliforniaQueso  extends PizzaProducto {

    public PizzaCaliforniaQueso(){
        nombre = "Pizza California Queso";
        masa = "Masa a la piedra delgada";
        salsa = "Salsa de tomate rucula";
        ingredientes.add("Extra queso Mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso azul");
    }
    @Override
    public void cocinar() {
        System.out.println("Cocinando a 35 min. a 100 ºC");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triangulos");

    }
}
