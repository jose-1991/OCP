package patronesDiseno.factory;

import patronesDiseno.factory.productos.PizzaProducto;
import patronesDiseno.factory.zona.PizzeriaCaliforniaFactory;
import patronesDiseno.factory.zona.PizzeriaNewYorkFactory;
import patronesDiseno.factory.zona.PizzeriaZonaAbstractFactory;

public class EjecucionFactory {
    public static void main(String[] args) {

        PizzeriaZonaAbstractFactory newYork = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = newYork.ordenarPizza("pepperoni");
        System.out.println("Andres ordena una " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena " + pizza.getNombre());

        pizza = newYork.ordenarPizza("italiana");
        System.out.println("Jose ordena la pizza " + pizza.getNombre());


        System.out.println("pizza = " + pizza);


    }
}
