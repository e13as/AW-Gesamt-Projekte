import java.util.*;

public class Tierheim {

    private List<Tier> tierList;

    public Tierheim(List<Tier> tierList) {
        this.tierList = tierList;
    }

    public Tier getlangsamtesTier() {
        double minSpeed = Double.MAX_VALUE;
        Tier lazyGonzales = tierList.get(0);
        for (Tier tier : tierList) {
            if (tier.getSpeed() < minSpeed) {
                minSpeed = tier.getSpeed();
                lazyGonzales = tier;
            }
        }
        return lazyGonzales;
    }

    public Tier getFastestAnimal() {
        Tier speedyGonzales = tierList
                            .stream()
                            .max(Comparator.comparing(Tier::getSpeed))
                            .get();
        return speedyGonzales;
    }

    public static void main(String[] args) {


        List<Tier> tl = new ArrayList<>();
        Tier katze1 = new Katze("short", 9);
        Tier katze2 = new Katze("long", 8);
        Tier hund1 = new Hund("middle", 10);
        tl.add(katze1);
        tl.add(katze2);
        tl.add(hund1);

        //Sortieren der TierListe je nach Name bzw. Speed
        System.out.println("The unsorted list of animal -> " + tl);
        List<Tier> sortedAnimals = tl
                .stream()
                .sorted(Comparator.comparing(Tier::getName))
                .toList();
        System.out.println("The list of the animal sorted by their names -> " + sortedAnimals);
        System.out.println();

        Tierheim th = new Tierheim(tl);

        System.out.println("The slowest animal is: " + th.getlangsamtesTier());
        System.out.println("The fastest animal around is: " + th.getFastestAnimal());
    }
}
