package generics.modelos;

public class Cliente {

        String nombre;
        String apellido;
        public Cliente(String nombre, String apellido){
            this.nombre = nombre;
            this.apellido = apellido;
        }
        Cliente(){}

        public String toString(){
            return "Nombre= " + nombre +", Apellido= " + apellido;
        }

}
