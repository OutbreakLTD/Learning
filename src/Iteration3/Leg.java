package Iteration3;

/**
 * Created by kmordvickij on 02.12.2016.
 */
public class Leg {
    static String part = "Нога";
    int weight;
    String name;
    @Override
    public String toString() {
        return this.part+" "+this.name+" "+this.weight;
    }
    Leg (){
        Material armMat = new Material();
        weight=armMat.weight;
        name=armMat.fullname;
        /*getMaterial(part);*/
    }
}
