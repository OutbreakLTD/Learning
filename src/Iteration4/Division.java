package Iteration4;

/**
 * Created by kmordvickij on 09.01.2017.
 */
public class Division implements Calculate {
    @Override
    public int calculate(int a, int b) {
        System.out.print(Division.class.getSimpleName() + " :");
        int c =0;
        try {
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 не умеем.");

        }

        return c;
    }
}
