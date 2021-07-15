package patronesDiseno.factory.zona;

import patronesDiseno.factory.productos.PizzaCaliforniaPepperoni;
import patronesDiseno.factory.productos.PizzaCaliforniaQueso;
import patronesDiseno.factory.productos.PizzaCaliforniaVegetariana;
import patronesDiseno.factory.productos.PizzaProducto;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;
            case "queso":
                producto = new PizzaCaliforniaQueso();
                break;
            case "pepperoni":
                producto = new PizzaCaliforniaPepperoni();
                break;
        }
        return producto;
    }
}
