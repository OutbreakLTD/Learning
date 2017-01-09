package Iteration4;

/**
 * Created by kmordvickij on 09.01.2017.
 */
public class RecD implements Calculate {
    @Override
    public int calculate(int a, int b) {
        int c = 0;
        System.out.print(RecD.class.getSimpleName() + " :");
        try {
            c = a / b;

            System.out.println(c);
            if(c!=0){
                calculate(c,b);

            }

        }
        catch (ArithmeticException e){
            System.out.println("Деление на 0 не умеем.");
        }
        return c;
    }
}
