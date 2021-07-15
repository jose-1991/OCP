package patronesDiseno.factory.zona;

import patronesDiseno.factory.productos.PizzaProducto;
import patronesDiseno.factory.productos.PizzaNewYorkItaliana;
import patronesDiseno.factory.productos.PizzaNewYorkPepperoni;
import patronesDiseno.factory.productos.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {


    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "vegetariana":
                producto = new PizzaNewYorkVegetariana();
                break;
            case "pepperoni":
                producto = new PizzaNewYorkPepperoni();
                break;
            case "italiana":
                producto = new PizzaNewYorkItaliana();
                break;
        }
        return producto;
    }
}

