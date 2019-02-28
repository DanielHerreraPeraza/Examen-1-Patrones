package cr.ac.ucenfotec.test;

import cr.ac.ucenfotec.Analytics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestAnalytics {
    @Test
    public void testMasLarga(){
        String text1 = "casa casita casototota";
        String text2 = "casa mia cosa";

        String[] expected1 = {"casototota"};
        String[] expected2 = {"casa","cosa"};

        String[] result1 = Analytics.masLarga(text1);
        String[] result2 = Analytics.masLarga(text2);

        assertArrayEquals(expected1,result1,"Should return [casototota]");
        assertArrayEquals(expected2,result2,"Should return [casa cosa]");
    }

    @Test
    public void testMasCorta() {
        String text1 = "casa casita casototota";
        String text2 = "casa mia cosa ala";

        String[] expected1 = {"casa"};
        String[] expected2 = {"ala","mia"};

        String[] result1 = Analytics.masCorta(text1);
        String[] result2 = Analytics.masCorta(text2);

        assertArrayEquals(expected1,result1,"Should return [casa]");
        assertArrayEquals(expected2,result2,"Should return [mia ala]");
    }

    @Test
    public void testMasLargaOrdenado() {
        String text = "cosa casa mia";
        String[] expected = {"casa","cosa"};
        String[] result = Analytics.masLarga(text);

        assertArrayEquals(expected,result,"Should return [casa cosa]");
    }

    @Test
    public void testMasCortaOrdenado(){
        String text = "casa mia cosa ala";
        String[] expected = {"ala","mia"};
        String[] result = Analytics.masCorta(text);

        assertArrayEquals(expected,result,"Should return [ala mia]");
    }

    @Test
    public void testPrimeraMasLarga() {
        String text = "cosa mia casa";
        String[] expected = {"cosa"};
        String[] result = Analytics.primeraMasLarga(text);

        assertArrayEquals(expected,result,"Should return [cosa]");
    }
}
