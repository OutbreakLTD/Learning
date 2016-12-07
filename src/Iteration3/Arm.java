package Iteration3;


/**
 * Created by kmordvickij on 02.12.2016.
 */
public class Arm {
    static String part = "Рука ";
    int weight;
    String name;
    @Override
    public String toString() {
        return this.part+" "+this.name+" "+this.weight;
    }
    Arm (){
        Material armMat = new Material();
        weight=armMat.weight;
        name=armMat.fullname;
        /*getMaterial(part);*/
    }
}
