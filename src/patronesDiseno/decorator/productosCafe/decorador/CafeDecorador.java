package patronesDiseno.decorator.productosCafe.decorador;

import patronesDiseno.decorator.productosCafe.Configurable;

abstract public class CafeDecorador implements Configurable {

    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}
