package de.awacademy.space;

import java.util.*;

public class Mission {
    Spaceship spaceship;
    int cargoWeight = 0;
    private List<Astronaut> crew = new ArrayList<>();

    public Mission(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    public void addCrewMember(Astronaut astronaut) {
        if (!crew.contains(astronaut)) {
            crew.add(astronaut);
        }

    }

    public int getCrewSize() {
        return crew.size();
    }

    public void removeCrewMember(Astronaut astronaut) {
        crew.remove(astronaut);
    }


    public Spaceship getSpaceship() {
        return spaceship;
    }

    public void setSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public boolean checkLaunchPermission() {
//            if (!crew.isEmpty()) {
//                if (crew.size() <= spaceship.getCrewCapacity()) {
//                    if ((getCargoWeight() + getCrewSize() * 100) <= spaceship.getMaxLoadWeight()) {
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }

        int astronautenGewicht = 0;


        if (crew.size() >= 1 && crew.size() <= spaceship.getCrewCapacity()) {
            for (Astronaut astronaut : crew) {
                astronautenGewicht += 100;
            }
            if ((getCargoWeight() + astronautenGewicht) <= spaceship.getMaxLoadWeight()) {

                return true;
            }

        }
        return false;

    }
}
