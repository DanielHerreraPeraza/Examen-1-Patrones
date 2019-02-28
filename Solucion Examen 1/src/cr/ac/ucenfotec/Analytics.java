package cr.ac.ucenfotec;

import java.util.Arrays;
import java.util.List;

public class Analytics {
    public static String[] masLarga(String text){
        String palabras[] = text.split(" ");
        int mayor = 0;
        int cant = 0;
        String[] result;

        for (String palabra : palabras) {
            if(palabra.length() == mayor){
                cant++;
            }
            if(palabra.length() > mayor){
                mayor = palabra.length();
                cant = 1;
            }
        }

        result = new String[cant];
        int pos = 0;

        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].length() == mayor) {
                result[pos++] = palabras[i];
            }
        }

        Arrays.sort(result);

        return result;
    }

    public static String[] masCorta(String text) {
        String palabras[] = text.split(" ");
        int menor = text.length();
        int cant = 0;
        String[] result;

        for (String palabra : palabras) {
            if(palabra.length() == menor){
                cant++;
            }
            if(palabra.length() < menor){
                menor = palabra.length();
                cant = 1;
            }
        }

        result = new String[cant];
        int pos = 0;

        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].length() == menor) {
                result[pos++] = palabras[i];
            }
        }

        return result;
    }
}
