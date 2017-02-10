package bonus1v2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kmordvickij on 07.02.2017.
 */
public class BaseSpecification {
    private String name;
    private Object value;
    private ArrayList<Object> values;

    public BaseSpecification(String name, ArrayList<Object> values) {
        this.name = name;
        this.values = values;
        int randomNumber = new Random().nextInt(values.size());
        this.value = values.get(randomNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ArrayList<Object> getValues() {
        return values;
    }

    public void setValues(ArrayList<Object> values) {
        this.values = values;
    }
}
