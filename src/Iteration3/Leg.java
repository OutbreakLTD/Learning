package Iteration3;

import java.util.Random;

/**
 * Created by kmordvickij on 02.12.2016.
 */
public class Leg extends BodyParts{

    Leg (){
        int pos = new Random().nextInt(Materials.values().length);
        materials = Materials.values()[pos];
        part = "Нога";
    }
}
