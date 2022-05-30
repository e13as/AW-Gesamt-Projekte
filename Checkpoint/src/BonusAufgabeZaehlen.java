public class BonusAufgabeZaehlen {

    public static void main(String[] args) {
        System.out.println(zahlZuWort(2));
    }

    public static String zahlZuWort(int zahl) {
        String[] einer = {"ein", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun"};
        String[] zehner = {"zehn", "zwanzig", "dreißig", "vierzig", "fünfzig", "sechzig", "siebzig", "achtzig", "neunzig"};
        String[] besonderheiten = {"eins", "elf", "zwölf", "sechzehn", "siebzehn", "hundert"};

        String wort = "";

        switch (zahl) {
            case 1:
                wort = besonderheiten[0];
                break;
            case 11:
                wort = besonderheiten[1];
                break;
            case 12:
                wort = besonderheiten[2];
                break;
            case 16:
                wort = besonderheiten[3];
                break;
            case 17:
                wort = besonderheiten[4];
                break;
            case 100:
                wort = besonderheiten[5];
                break;
        }
        if (wort.equals("")) {
            int zahlGeteiltDurchZehn = zahl / 10;
            if (zahl % 10 == zahl) {
                wort = einer[zahl - 1];
            } else if (zahl == zahlGeteiltDurchZehn * 10) {
                wort = zehner[zahl / 10 - 1];
            } else if (zahl % 10 != 0) {
                int einerTeil = zahl % 10;
                int zehnerTeil = (zahl - einerTeil) / 10;
                if (zahl < 20) {
                    wort = einer[einerTeil - 1] + zehner[zehnerTeil - 1];
                } else {
                    wort = einer[einerTeil - 1] + "und" + zehner[zehnerTeil - 1];
                }
            }
        }
        return wort + ": " + zahl;
    }

}

