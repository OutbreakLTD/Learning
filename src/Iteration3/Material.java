package Iteration3;

import java.util.Random;

/**
 * Created by kmordvickij on 02.12.2016.
 */
public class  Material {

    public String part;
    public String material;
    public String fullname;
    public Materials materials;
    int weight;

    Material(){
        int pos = new Random().nextInt(Materials.values().length);
        materials = Materials.values()[pos];
        weight=materials.mWeight();
        fullname=materials.toString();

    }

}
