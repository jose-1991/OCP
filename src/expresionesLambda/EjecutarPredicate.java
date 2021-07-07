package expresionesLambda;

import expresionesLambda.modelos.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjecutarPredicate {
    public static void main(String[] args) {
        Predicate<Integer> t1 = num -> num >10;
        boolean r = t1.test(11);
        System.out.println("r = " + r);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_ADMIN"));

        BiPredicate<String, String> t3 = String::equals; //(a, b) -> a.equals(b);
        System.out.println(t3.test("Andres", "Jose"));

        BiPredicate<Integer, Integer> t4 = (i, j) -> i>j;
        System.out.println(t4.test(5,10));

        Usuario a = new Usuario();
        Usuario b = new Usuario();

        a.setNombre("maria");
        b.setNombre("maria");

        BiPredicate<Usuario, Usuario> t5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(t5.test(a,b));
    }
}
