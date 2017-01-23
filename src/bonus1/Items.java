package bonus1;


import java.util.Random;

/**
 * Created by kmordvickij on 18.01.2017.
 */
public enum Items implements Stuff {
    FLASHLIGHT("Фонарик",Type.ITEM, 234, 235445),
    ZIPPO("Зажигалка",Type.ITEM, 234, 3453);
    private final String displayName;
    private final Type objType;
    private final int minWeight;
    private final int maxWeight;



    Items(String displayName, Type objType, int minWeight, int maxWeight){
        this.displayName=displayName;
        this.objType=objType;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    public String getName(){
        return this.displayName;
    }
    public String getType(){
        return this.objType.toString();
    }
    public int getWeight(){

        return new Random().nextInt((maxWeight-minWeight)+1)+minWeight;
    }
}
