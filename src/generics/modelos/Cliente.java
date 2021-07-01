package generics.modelos;

public class Cliente {
        static int id;
        String nombre;
        String apellido;
        public Cliente(String nombre, String apellido){
            this.nombre = nombre;
            this.apellido = apellido;
        }
        Cliente(){}

        public String toString(){
            return ++id + ") " + nombre +" " + apellido;
        }

}
