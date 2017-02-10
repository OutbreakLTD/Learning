package bonus1v2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kmordvickij on 07.02.2017.
 */
public class Zippo extends Items {


    public Zippo() {

            super("Предмет", "Зажигалка", 20, 70);
            getSpecifications().add(new BaseSpecification("Газовая", new ArrayList(Arrays.asList("Да", "Нет"))));
            getSpecifications().add(new BaseSpecification("Брендовая", new ArrayList(Arrays.asList("Да", "Нет"))));
    }
}
