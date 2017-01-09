package Iteration3;

import java.util.Random;

/**
 * Created by kmordvickij on 02.12.2016.
 */
public class BodyParts {


    public String part;
    public Materials materials;
    @Override
    public String toString() {
        return this.part+" "+materials.toString()+" "+materials.mWeight();
    }


}
