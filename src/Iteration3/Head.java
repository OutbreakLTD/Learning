package Iteration3;

/**
 * Created by kmordvickij on 02.12.2016.
 */
public class Head {
    static String part = "Голова";
    int weight;
    String name;
    @Override
    public String toString() {
        return this.part+" "+this.name+" "+this.weight;
    }
    Head (){
        Material armMat = new Material();
        weight=armMat.weight;
        name=armMat.fullname;
        /*getMaterial(part);*/
    }
}
