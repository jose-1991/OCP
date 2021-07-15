package patronesDiseno.decorator.formatearTexto.decorador;

import patronesDiseno.decorator.formatearTexto.Formateable;

abstract public class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
