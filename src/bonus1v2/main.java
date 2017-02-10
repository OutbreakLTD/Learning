package bonus1v2;

import bonus1.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kmordvickij on 07.02.2017.
 */
public class main {
    public static void main(String[] args) {


        printBasketSet(getBasketSet());
    }


    private static ArrayList<Items> getBasket() {
        ArrayList<Items> b = new ArrayList<>();

        for (int j = 0; j <= new Random().nextInt(4) + 1; j++) {


            b.add(ItemList.values()[new Random().nextInt(4)].getO());

        }

        return b;
    }

    private static ArrayList<ArrayList<Items>> getBasketSet() {
        ArrayList<ArrayList<Items>> bs = new ArrayList<>();
        for (int j = 0; j <= new Random().nextInt(4) + 1; j++) {


            bs.add(getBasket());
        }
        return bs;
    }

    ;

    public static void printBasketSet(ArrayList<ArrayList<Items>> bs) {
        int allBasketWeight = 0;
        for (ArrayList<Items> i : bs) {
            int basketWeight = 0;
            for (Items j : i) {
                basketWeight += j.getWeight();
                System.out.println(j.toString());

                System.out.println("____________________");
            }
            System.out.println("Общий вес карзины: " + basketWeight);
        }
        System.out.println("Общий вес " + bs.size() + " карзин: " + allBasketWeight);
    }
}
