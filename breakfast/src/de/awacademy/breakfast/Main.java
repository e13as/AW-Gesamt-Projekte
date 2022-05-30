package de.awacademy.breakfast;

import de.awacademy.kitchen.*;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        Breakfast breakfast = new Breakfast();


        Cup cup = breakfast.getUtensils().getCup();
        WaterTap waterTap = breakfast.getUtensils().getWaterTap();
        WaterBoiler waterBoiler = breakfast.getUtensils().getWaterBoiler();
        Spoon spoon = breakfast.getUtensils().getSpoon();
        Knife knife = breakfast.getUtensils().getKnife();
        Toaster toaster = breakfast.getUtensils().getToaster();
        Pot pot = breakfast.getUtensils().getPot();



//        Thread teaWaterBoilerPourIn = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                waterBoiler.pourIn(waterTap.getWater(cup.getVolume()));
//            }
//        }); man kann es auch als Lambda Funktion schreiben wie unten:

        Thread teaWaterBoilerPourIn = new Thread(() -> waterBoiler.pourIn(waterTap.getWater(cup.getVolume())));
        Thread teaWaterBoilerBoil = new Thread(waterBoiler::boil);
        Thread teaCupPourIn = new Thread(() -> cup.pourIn(waterBoiler.pourOut()));
        Thread teaCupPourInMilk = new Thread(() -> cup.pourIn(new Milk()));
        Thread teaCupLetTeaBrew = new Thread(() -> cup.letTeaBrew(new TeaBag()));
        Thread teaSugarSpoon = new Thread(() -> spoon.spoon(new Sugar(), cup));
        Thread teaStirSpoon = new Thread(() -> spoon.stir(cup));


        BreadSlice marmaladeToast = new BreadSlice();
        Thread marmaladeToasterToast = new Thread(() -> toaster.toast(marmaladeToast));
        Thread marmaladeKnifeSmear = new Thread(() -> knife.smear(new Butter(), marmaladeToast));
        Thread marmeladeSpoon = new Thread(() -> spoon.spoon(new Marmalade(), marmaladeToast));

        BreadSlice cheeseToast = new BreadSlice();
        Thread cheeseToasterToast = new Thread(() -> toaster.toast(cheeseToast));
        Thread cheeseKnifeSmear = new Thread(() -> knife.smear(new Butter(), cheeseToast));
        Thread cheesePutOn = new Thread(() -> cheeseToast.putOn(new Cheese()));

        Egg egg = new Egg();
        Thread eggPourIn = new Thread(()-> pot.pourIn(waterTap.getWater(pot.getVolume())));
        Thread eggBoilWater = new Thread(pot::boilWater);
        Thread eggBoilEgg = new Thread(()->pot.boilEgg(egg));

        Apple apple = new Apple();
        Thread appleWash = new Thread(()->waterTap.wash(apple));


        teaWaterBoilerPourIn.start();
        teaWaterBoilerPourIn.join();
        teaWaterBoilerBoil.start();

        eggPourIn.start();
        eggPourIn.join();
        eggBoilWater.start();

        marmaladeToasterToast.start();
        marmaladeToasterToast.join();
        cheeseToasterToast.start();

        marmaladeKnifeSmear.start();
        marmaladeKnifeSmear.join();

        cheeseToasterToast.join();
        cheeseKnifeSmear.start();
        cheeseKnifeSmear.join();

        marmeladeSpoon.start();
        marmaladeToasterToast.join();
        cheesePutOn.start();
        cheesePutOn.join();

        teaWaterBoilerBoil.join();

        eggBoilWater.join();
        eggBoilEgg.start();

        teaCupPourIn.start();
        teaCupPourInMilk.start();
        teaCupPourIn.join();
        teaCupPourInMilk.join();

        teaCupLetTeaBrew.start();
        teaSugarSpoon.start();
        teaSugarSpoon.join();
        teaCupLetTeaBrew.join();
        teaStirSpoon.start();
        teaStirSpoon.join();

        appleWash.start();
        appleWash.join();

        eggBoilEgg.join();

        ApplePiece[] applePieces = knife.cut(apple);
        breakfast.ready(cup, marmaladeToast, cheeseToast, egg, applePieces);
    }
}
