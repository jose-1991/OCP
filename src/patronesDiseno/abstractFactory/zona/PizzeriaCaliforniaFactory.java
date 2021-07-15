package patronesDiseno.abstractFactory.zona;

import patronesDiseno.abstractFactory.productos.PizzaCaliforniaPepperoni;
import patronesDiseno.abstractFactory.productos.PizzaCaliforniaQueso;
import patronesDiseno.abstractFactory.productos.PizzaCaliforniaVegetariana;
import patronesDiseno.abstractFactory.productos.PizzaProducto;

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
