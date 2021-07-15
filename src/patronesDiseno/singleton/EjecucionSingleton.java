package patronesDiseno.singleton;

import patronesDiseno.singleton.ConexionBDSingleton;

public class EjecucionSingleton {
    public static void main(String[] args) {

        ConexionBDSingleton con = null;
        for (int i = 0; i<5 ; i++){
            con = ConexionBDSingleton.getInstancia();
            System.out.println("con = " + con);
        }

        ConexionBDSingleton con2 = ConexionBDSingleton.getInstancia();

        boolean b1 = (con==con2);
        System.out.println("b1 = " + b1);
    }
}
