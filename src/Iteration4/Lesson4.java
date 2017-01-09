package Iteration4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kmordvickij on 06.12.2016.
 */
public class Lesson4 {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите первое целое число: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int b = 0;
        boolean fn = false;
        do {
            try {
                a = Integer.parseInt(reader.readLine());
                fn = false;
            } catch (NumberFormatException e) {
                System.out.println("Не похоже на целое число, попробуйте еще раз ввести первое число: ");
                fn = true;
            }
        } while (fn == true);
        System.out.print("Введите второе целое число: ");
        do {
            try {
                b = Integer.parseInt(reader.readLine());
                fn = false;
            } catch (NumberFormatException e) {
                System.out.println("Не похоже на целое число, попробуйте еще раз ввести второе число: ");
                fn = true;
            }
        } while (fn == true);

        System.out.println(new Addition().calculate(a, b));
        System.out.println(new Multiplication().calculate(a, b));
        System.out.println(new Substraction().calculate(a, b));
        new Division().calculate(a, b);

        new RecD().calculate(a, b);
    }


}
