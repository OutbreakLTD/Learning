package bonus1;


import java.util.Random;

/**
 * Created by kmordvickij on 18.01.2017.
 */
public enum Products implements Stuff {
    SODA("Газировка","Продукт", 1, 5),
    ORANGE("Апельсин","Продукт", 1, 120),
    FLASHLIGHT("Фонарик","Предмет", 234, 235445),
    ZIPPO("Зажигалка","Предмет", 234, 3453);
    private final String displayName;
    private final String objType;
    private final int minWeight;
    private final int maxWeight;



    Products(String displayName, String objType, int minWeight,int maxWeight){
        this.displayName=displayName;
        this.objType=objType;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    public String getName(){
        return this.displayName;
    }
    public String getType(){
        return this.objType;
    }
    public int getWeight(){

        return new Random().nextInt((maxWeight-minWeight)+1)+minWeight;
    }
}
