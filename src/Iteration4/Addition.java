package Iteration4;

/**
 * Created by kmordvickij on 09.01.2017.
 */
public class Addition implements Calculate {

    public int calculate(int a, int b) {
        int  c = a + b;
        System.out.print(Addition.class.getSimpleName() + " :");
        return c;
    }
}
