package patronesDiseno.abstractFactory;

import patronesDiseno.abstractFactory.productos.PizzaProducto;
import patronesDiseno.abstractFactory.zona.PizzeriaCaliforniaFactory;
import patronesDiseno.abstractFactory.zona.PizzeriaNewYorkFactory;
import patronesDiseno.abstractFactory.zona.PizzeriaZonaAbstractFactory;

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
