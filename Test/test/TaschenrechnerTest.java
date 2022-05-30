import org.junit.Test;

import static org.junit.Assert.*;

public class TaschenrechnerTest {

    @Test
    public void ergebnisIstAnfangs0(){
        Taschenrechner taschenrechner = new Taschenrechner();
        assertEquals(0,taschenrechner.getErgebnis());
    }

    public void testPlusMethode(){
        Taschenrechner taschenrechner = new Taschenrechner();
        taschenrechner.plus(5);
        taschenrechner.plus(10);
        assertEquals(15, taschenrechner.getErgebnis());
    }

    public void testMinusMethode(){
        Taschenrechner taschenrechner = new Taschenrechner();
        taschenrechner.minus(5);
        taschenrechner.minus(10);
        assertEquals(-15,taschenrechner.getErgebnis());
    }

    public void testMalMethode(){
        Taschenrechner taschenrechner = new Taschenrechner();
        taschenrechner.plus(3);
        taschenrechner.mal(5);
        assertEquals(15,taschenrechner.getErgebnis());
    }
}
