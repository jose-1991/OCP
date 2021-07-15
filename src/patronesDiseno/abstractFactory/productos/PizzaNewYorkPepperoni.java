package patronesDiseno.abstractFactory.productos;

public class PizzaNewYorkPepperoni extends PizzaProducto {

    public PizzaNewYorkPepperoni(){
        nombre = "Pizza pepperoni";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra pepperoni");
        ingredientes.add("Aceitunas");

    }
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. a 90 *C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulo");

    }
}
