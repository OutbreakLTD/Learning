package Iteration3;

/**
 * Created by kmordvickij on 01.12.2016.
 */
public class CastIron {
    static String mName = " Чугун ";
    public String name;

    CastIron(String part) {
        if (part.endsWith("а")) {
            name = "Чугунная " + part;
        } else if (part.endsWith("о")) {
            name = "Чугунное " + part;
        }
    }

    ;
}
