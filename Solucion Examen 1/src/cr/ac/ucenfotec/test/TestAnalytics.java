package cr.ac.ucenfotec.test;

import cr.ac.ucenfotec.Analytics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAnalytics {
    @Test
    public void testMasLarga(){
        String text = "casa mia cosa";
        String[] expected = {"casa","cosa"};
        String[] result = Analytics.masLarga(text);

        assertArrayEquals(expected, result,"Should return [casa cosa]");
    }
}
