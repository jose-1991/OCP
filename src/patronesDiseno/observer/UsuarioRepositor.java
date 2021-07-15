package patronesDiseno.observer;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositor extends Observable{

    private List<String> repositorio = new ArrayList<>();
    public void crearUsuario(String usuario){
        repositorio.add(usuario);
        notifyObserver(usuario);
    }
}
