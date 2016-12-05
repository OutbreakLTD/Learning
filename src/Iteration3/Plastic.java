package Iteration3;

/**
 * Created by kmordvickij on 01.12.2016.
 */
public class Plastic {
    static String mName = " Пластик ";
    public String name;

    Plastic(String part) {
        if (part.endsWith("а")) {
            name = "Пластиковая " + part;
        } else if (part.endsWith("о")) {
            name = "Пластиковое " + part;
        }
    }

    ;
}
