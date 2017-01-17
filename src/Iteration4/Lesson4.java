package Iteration4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by kmordvickij on 06.12.2016.
 */
public class Lesson4 {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arguments = new ArrayList<>();
        boolean falsenumber = false;

        for(int i= 1; i<3;i++)
        {


            do {
                System.out.print("Введите  число #" +i);
                try {
                    arguments.add(Integer.parseInt(reader.readLine()));
                    falsenumber = false;
                } catch (NumberFormatException e) {
                    System.out.println("Не похоже на целое число, попробуйте еще раз ввести первое число: ");
                    falsenumber = true;
                }
            } while (falsenumber == true);
        }

        ArrayList<Calculate> calculateObj = new ArrayList<Calculate>();
        calculateObj.add(new Addition());
        calculateObj.add(new Multiplication());
        calculateObj.add(new Substraction());
        calculateObj.add(new Division());
        calculateObj.add(new RecD());

        for(int i = 0; i<calculateObj.size();i++)
        {
            System.out.println(calculateObj.get(i).calculate(arguments.get(0), arguments.get(1)));
        }

    }


}
