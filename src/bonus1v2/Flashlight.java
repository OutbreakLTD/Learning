package bonus1v2;

import bonus1.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kmordvickij on 07.02.2017.
 */
public class Flashlight extends Items{

    public Flashlight() {
        super("Предмет", "Фонарик", 50, 500);
        getSpecifications().add(new BaseSpecification("На батарейках", new ArrayList(Arrays.asList("Да", "Нет"))));
        getSpecifications().add(new BaseSpecification("С линзой", new ArrayList(Arrays.asList("Да", "Нет"))));
    }
}
