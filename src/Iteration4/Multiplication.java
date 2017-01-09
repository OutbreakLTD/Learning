package Iteration4;

/**
 * Created by kmordvickij on 09.01.2017.
 */
public class Multiplication implements Calculate {
    @Override
    public int calculate(int a, int b) {
        int  c = a * b;
        System.out.print(Multiplication.class.getSimpleName() + " :");
        return c;
    }
}
