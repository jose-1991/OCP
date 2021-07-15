package patronesDiseno.decorator.formatearTexto;

import patronesDiseno.decorator.formatearTexto.decorador.MayusculaDecorador;
import patronesDiseno.decorator.formatearTexto.decorador.ReversaDecorador;
import patronesDiseno.decorator.formatearTexto.decorador.SubrayadoDecorador;

public class EjecucionDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Jose");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);

        System.out.println(subrayar.darFormato());
    }
}
