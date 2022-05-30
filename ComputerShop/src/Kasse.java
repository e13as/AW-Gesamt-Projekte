public class Kasse {

    public static int gesamtPreis(Artikel[] artikels){
        // Todo: berechne gesamtpreis
        int preisgesamt = 0;
        for (Artikel artikel: artikels) {
           preisgesamt += artikel.getPreis();
        }

        return preisgesamt;
    }

    public static String quittung(Artikel[] artikels){

        int gesamtpreis = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < artikels.length ; i++) {
            stringBuilder.append(artikels[i].getName() + " ");
            stringBuilder.append(artikels[i].getArtikelNr() + " ");
            stringBuilder.append(artikels[i].getPreis());
            System.out.println();
        }
        return stringBuilder.toString();
    }
}
