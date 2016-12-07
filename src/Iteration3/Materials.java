package Iteration3;

import java.util.Random;

/**
 * Created by kmordvickij on 06.12.2016.
 */
public enum Materials {
    STEEL(10,20,"Сталь"),
    PLASTIC(1,9,"Пластик"),
    CASTIRON(21,30,"Чугун");

    private final int minWeight;
    private final int maxWeight;
    private String displayName;


    Materials(int minWeight, int maxWeight, String displayName) {
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.displayName = displayName;
    }
    int mWeight(){

        return new Random().nextInt((maxWeight-minWeight)+1)+minWeight;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
