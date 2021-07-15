package patronesDiseno.factory.productos;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana(){
        nombre = "Pizza California Vegetariana";
        masa = "MAsa delgada light";
        salsa = "Salsa BBQ Light";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
        ingredientes.add("Berenjena");
    }
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min. a 180 ºC");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares");

    }
}
