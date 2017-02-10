package bonus1v2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kmordvickij on 23.01.2017.
 */
public class Specification {
    static ArrayList<String> colors= new ArrayList<>();
    static {
        colors.add("Red");
        colors.add("Orange");
        colors.add("Cherry");
    }

    static ArrayList<String> taste= new ArrayList<>();
    static {
        taste.add("CocaCola");
        taste.add("Orange");
        taste.add("Cherry");
        taste.add("Soda");

    }

    static ArrayList<String> smell= new ArrayList<>();
    static {
        smell.add("BubbleGam");
        smell.add("Marihuanna");
        smell.add("Cherry");
        smell.add("Pineapple");

    }



    public static String getColor() {
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(colors.size());

        return "Цвет: "+colors.get(randomNumber);
    };
    public static String getTaste() {
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(taste.size());

        return "Вкус: "+taste.get(randomNumber);
    };
    public static String getSmell() {
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(smell.size());

        return "Запах: "+smell.get(randomNumber);
    };



}
