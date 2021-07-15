package patronesDiseno.observer.ejecuciones;

import patronesDiseno.observer.UsuarioRepositor;

public class EjecucionAccionistas2 {

    public static void main(String[] args) {
        UsuarioRepositor repo = new UsuarioRepositor();
        repo.addObserver((o, u) -> System.out.println("Enviar un email al usuario " + u));
        repo.addObserver((o, u) -> System.out.println("Enviando un email al administrador"));
        repo.addObserver((o, u) -> System.out.println("Guardando info del usuario "+ u + " en el logs"));
        repo.crearUsuario("Andres");
    }
}
