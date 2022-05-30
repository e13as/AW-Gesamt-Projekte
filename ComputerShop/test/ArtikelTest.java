import org.junit.Test;
import static org.junit.Assert.*;

public class ArtikelTest {

    @Test
    public void testGesamtPreisFuerArtikelArray(){

        int gesamtpreis = 0;
        Artikel[] artikels = new Artikel[4];
        artikels[0] = new Tastaturen(true,"Fujitsu","Fujitsu", "Fujitsu", 100,true);
        artikels[1] = new Maus(2,"Fujitsu","Fujitsu", "Fujitsu", 150,true);
        artikels[2] = new SSDSpeicher(500,"Ridata","XXX", "56-15-41", 50);
        artikels[3] = new Prozessoren(12,"Intel","XXX", "12-12-12", 100);

        int expectedGesamtpreis = 400;



        for (Artikel artikel: artikels) {
            gesamtpreis += artikel.getPreis();
        }

        assertEquals(expectedGesamtpreis, gesamtpreis);
    }
}
