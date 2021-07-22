package localization;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class metodos {
    public static void main(String[] args) {

        Locale loc = new Locale("de");
        Locale loc2 = new Locale.Builder().setLanguage("zh").build();
        ResourceBundle rb = ResourceBundle.getBundle("SRBundle",loc);
        System.out.println(rb.getKeys());




    }
}

class SRBundle extends ListResourceBundle{

    @Override
    protected Object[][] getContents() {
        Object[][] recursos = new Object[2][2];
        recursos[0][0] = "Hello";    recursos[0][1] = "Bonjour";
        recursos[1][0] = "Goodbye";  recursos[1][1] = "Au revoir";
        return recursos;
    }
}
