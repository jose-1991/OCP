package examCloud;

import java.io.Console;
import java.util.Locale;

public class Local {
    public static void main(String[] args) {
        Locale ENUS = new Locale.Builder().setLanguage("en").setRegion("US").build();
        System.out.println(ENUS.getDisplayCountry(new Locale("fr")));


        Console c = System.console();
        char [] ch = c.readPassword("password: ");
        System.out.println(ch);
    }
}
