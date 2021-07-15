package patronesDiseno.abstractFactory.zona;

import patronesDiseno.abstractFactory.productos.PizzaProducto;
import patronesDiseno.abstractFactory.productos.PizzaNewYorkItaliana;
import patronesDiseno.abstractFactory.productos.PizzaNewYorkPepperoni;
import patronesDiseno.abstractFactory.productos.PizzaNewYorkVegetariana;

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

