package patronesDiseno.decorator.productosCafe;

import patronesDiseno.decorator.productosCafe.decorador.ConChocolateDecorador;
import patronesDiseno.decorator.productosCafe.decorador.ConCremaDecorador;
import patronesDiseno.decorator.productosCafe.decorador.ConLecheDecorador;

public class EjecucionCafe {
    public static void main(String[] args) {
        Configurable cafe = new Cafe("Cafe Mocha", 7);

        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);

        System.out.println("el precio del cafe moca es: " + conChocolate.getPrecioBase());
        System.out.println("Los ingredientes " + conChocolate.getIngredientes());


        Configurable capuchino = new Cafe("Cafe Capuchino", 4);
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);

        System.out.println("el precio del capuchino es: " + conLeche.getPrecioBase());
        System.out.println("los ingredientes " + conLeche.getIngredientes());

        Configurable espresso = new Cafe("Cafe espresso", 3);
        System.out.println("El precio del cafe espresso es: " +espresso.getPrecioBase());
        System.out.println("Los ingredientes son " + espresso.getIngredientes());



    }
}
