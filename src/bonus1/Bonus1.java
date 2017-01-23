package bonus1;

import java.util.*;

/**
 * Created by kmordvickij on 18.01.2017.
 */
public class Bonus1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Stuff>> baskets = new ArrayList<>();
        newBaskets(baskets);
        int allBasketWeight = 0;
        for (int j = 1; j <= baskets.size(); j++) {
            int baskeWeight = 0;
            System.out.println("Корзина #" + j);
            for (int i = 0; i < baskets.get(j - 1).size(); i++) {
                baskeWeight += baskets.get(j - 1).get(i).getWeight();
                System.out.println("\t" + baskets.get(j - 1).get(i).getType() + " :" + baskets.get(j - 1).get(i).getName() + ", Вес: " + baskets.get(j - 1).get(i).getWeight() + " " + getOptions((Products) baskets.get(j - 1).get(i)));
                ;
            }
            allBasketWeight += baskeWeight;
            System.out.println("Общий вес корзины: " + baskeWeight);
        }
        System.out.println("Общий вес всех корзин: " + allBasketWeight);
        recDev((double) allBasketWeight);

    }

    private static void newBaskets(ArrayList<ArrayList<Stuff>> arr) {
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(4) + 1;
        for (int i = 0; i <= randomNumber; i++) {
            ArrayList<Stuff> prod = new ArrayList<Stuff>();

            arr.add(prod);
            for (int j = 0; j < 5; j++) {

                int randomNumber1 = randomizer.nextInt(4);

                prod.add(Products.values()[randomNumber1]);
            }
        }

    }

    public static String getOptions(Products products) {
        if (products.equals(Products.SODA)) {
            String color = Options.COLOR.getoName() + Specification.getColor();
            String smell = Options.SMELL.getoName() + Specification.getSmell();
            String taste = Options.TASTE.getoName() + Specification.getSmell();
            return color + " " + taste + " " + smell;
        } else if (products.equals(Products.ORANGE)) {

            return Options.FRESH.getoName() + getRandomBoolean() + " " + Options.CONDITION.getoName() + getRandomBoolean();

        } else if (products.equals(Products.FLASHLIGHT)) {
            return Options.LENS.getoName() + getRandomBoolean() + " " + Options.BATTERY.getoName() + getRandomBoolean();
        } else if (products.equals(Products.ZIPPO)) {
            return Options.GAS.getoName() + getRandomBoolean() + " " + Options.BRAND.getoName() + getRandomBoolean();
        }
        return null;
    }

    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;

    }

    public static void recDev(double a) {
        double b = a / 2;
        if ((int) b > 0) {
            System.out.println(b);

            recDev(b);

        }

    }

}
