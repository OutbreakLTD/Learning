package bonus1v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by kmordvickij on 07.02.2017.
 */
public class Soda extends Items {
    public Soda() {
        super("Продукт", "Газировка", 250, 2500);
        getSpecifications().add(new BaseSpecification("Color", new ArrayList(Arrays.asList("Red", "Orange", "Cherry"))));
        getSpecifications().add(new BaseSpecification("Taste", new ArrayList(Arrays.asList("CocaCol", "Orange", "Choco"))));
        getSpecifications().add(new BaseSpecification("Smell", new ArrayList(Arrays.asList("Strawberry", "Orange", "Marihuana"))));
    }

}
