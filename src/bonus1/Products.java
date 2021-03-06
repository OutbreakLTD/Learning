package bonus1;


import java.util.Random;

/**
 * Created by kmordvickij on 18.01.2017.
 */
public enum Products implements Stuff {
    SODA("Газировка",Type.PRODUCT, 1, 5),
    ORANGE("Апельсин",Type.PRODUCT, 1, 120);
    private final String displayName;
    private final Type objType;
    private final int minWeight;
    private final int maxWeight;



    Products(String displayName, Type objType, int minWeight,int maxWeight){
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
