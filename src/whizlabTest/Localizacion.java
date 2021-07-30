package whizlabTest;

import java.util.Locale;
import java.util.ResourceBundle;

public class Localizacion {
    public static void main(String[] args) {
        Locale ENUS = new Locale.Builder().setLanguage("en").setRegion("US").build();
        System.out.println(ENUS.getDisplayLanguage(new Locale("fr")));


    }
}
