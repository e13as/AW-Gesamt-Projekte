package de.awacademy.breakfast;

import de.awacademy.kitchen.*;


public class Aufgabenstellung {

    public static void main(String[] args) {
        Breakfast breakfast = new Breakfast();

        Cup cup = breakfast.getUtensils().getCup();
        WaterTap waterTap = breakfast.getUtensils().getWaterTap();
        WaterBoiler waterBoiler = breakfast.getUtensils().getWaterBoiler();
        Spoon spoon = breakfast.getUtensils().getSpoon();
        Knife knife = breakfast.getUtensils().getKnife();
        Toaster toaster = breakfast.getUtensils().getToaster();
        Pot pot = breakfast.getUtensils().getPot();

        waterBoiler.pourIn(waterTap.getWater(cup.getVolume()));
        waterBoiler.boil();
        cup.pourIn(waterBoiler.pourOut());
        cup.pourIn(new Milk());
        cup.letTeaBrew(new TeaBag());
        spoon.spoon(new Sugar(), cup);
        spoon.stir(cup);

        BreadSlice marmaladeToast = new BreadSlice();
        toaster.toast(marmaladeToast);
        knife.smear(new Butter(), marmaladeToast);
        spoon.spoon(new Marmalade(), marmaladeToast);

        BreadSlice cheeseToast = new BreadSlice();
        toaster.toast(cheeseToast);
        knife.smear(new Butter(), cheeseToast);
        cheeseToast.putOn(new Cheese());

        Egg egg = new Egg();
        pot.pourIn(waterTap.getWater(pot.getVolume()));
        pot.boilWater();
        pot.boilEgg(egg);

        Apple apple = new Apple();
        waterTap.wash(apple);
        ApplePiece[] applePieces = knife.cut(apple);

        breakfast.ready(cup, marmaladeToast, cheeseToast, egg, applePieces);
    }
}
