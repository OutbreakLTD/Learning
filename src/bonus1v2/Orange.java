package bonus1v2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kmordvickij on 07.02.2017.
 */
public class Orange extends Items {


    public Orange() {
        super("Продукт", "Апельсин", 250, 2500);
        getSpecifications().add(new BaseSpecification("Свежие", new ArrayList(Arrays.asList("Да", "Нет"))));
        getSpecifications().add(new BaseSpecification("Спелые", new ArrayList(Arrays.asList("Да", "Нет"))));
    }
}
