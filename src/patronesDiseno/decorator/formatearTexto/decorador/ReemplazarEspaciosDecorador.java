package patronesDiseno.decorator.formatearTexto.decorador;

import patronesDiseno.decorator.formatearTexto.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecorador{

    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {

        return texto.darFormato().replace(" ", "_");
    }
}
