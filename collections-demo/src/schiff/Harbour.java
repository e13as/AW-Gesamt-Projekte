package schiff;

import java.util.ArrayList;
import java.util.List;

public class Harbour {


    public static void main(String[] args) {

        Ship s1 = new Ship("Flying Dutchman", 100_000);
        s1.setDestinationPort("Shanghai");

        Ship s2 = new Ship("MSC Java", 50_000);
        s2.setDestinationPort("Singapore");

        Ship s3 = new Ship("Lüttes Schipp", 5);
        s3.setDestinationPort("Cape Town");

        List<Ship> ships = List.of(s1, s2, s3);

        List<Container> containerPool = new ArrayList<>();

        // Create 500 container for our ships
        for (int i = 0; i < 500; i++) {
            int length = (i % 2 == 0) ? 1200 : (i % 3 == 0) ? 900 : 700;
            String homePort = (i % 6 == 0) ? "Rotterdam" : (i % 5 == 0) ? "Panama" : "Hamburg";
            String destinationPort = (i % 6 == 0) ? "Cape Town" : (i % 5 == 0) ? "Singapore" : "Shanghai";
            Container container = new Container(length, homePort, destinationPort);
            container.setWeight((i % 2 == 0) ? 5_000 : (i % 3 == 0) ? 3_000 : 2_500);
            containerPool.add(container);
        }

        System.out.println("containerPool = " + containerPool);

        // Aufgaben für Montag - kein Bezug zum Checkpoint!

        // 1a: Select the ship with the destination 'Shanghai'

        // TODO: implement here
        for (Ship ship: ships) {
            if (ship.getDestinationPort().equals("Shanghai")){
                System.out.println(ship.getName());
            }

        }

        // 1b: Get all containers with the destination 'Shanghai', and save them in a list


        // TODO: implement here
        List<Container> destiShanghai = new ArrayList<>();
        for (Container container: containerPool) {
            if (container.getZielHafen().equals("Shanghai")){
                destiShanghai.add(container);
            }
        }


        // 1c: Adding containers (weight in kg!) to the ship until the maximum weight of the ship (weight in ton!) is reached

        // TODO: implement here
        int gesamtGewicht = 0;
        for (int i = 0; i < destiShanghai.size(); i++) {
            if (gesamtGewicht <= s1.getMaxWeight()*1000){
                gesamtGewicht += destiShanghai.get(i).getWeight();
                System.out.println(i + 1 + " " + destiShanghai.get(i));
            }
        }
        System.out.println(gesamtGewicht);

    }
}
