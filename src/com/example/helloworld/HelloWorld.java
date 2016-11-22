package com.example.helloworld;

import java.awt.*;
import java.io.Console;
import java.util.Scanner;

/**
 * Created by kmordvickij on 18.11.2016.
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("       Здравствуйте! Введите номер  программы для начала выполнения:");
        boolean isRunning = true;
        while (isRunning) {
            int ex;
            System.out.println(
                    "        1 - вывод последовательности введенных чисел в столбик\n" +
                    "        2 - вычисление квадратного корня\n" +
                    "        3 - печать приветствия для введенного имени\n" +
                    "        4 - выход");

            Scanner pr1 = new Scanner(System.in);
            ex=pr1.nextInt();
            isRunning=exercize(ex);
        }


    }

    private static boolean exercize(int ex) {
        if(ex==1){
            System.out.print("Укажите количество чисел:");
            Scanner kn = new Scanner(System.in);
            int nm=kn.nextInt();
            int[] arr1=new int[nm];
            for(int i=0;i<arr1.length; i++)
            {
                Scanner arn= new Scanner(System.in);
                arr1[i]=arn.nextInt();
            }
            System.out.println("Введенные числа:");
            for(int i=0;i<arr1.length; i++)
            {
                System.out.println(arr1[i]);
            }
        }
        else if(ex==2){
            System.out.println("Введите не отрицательное число:\n");
            Scanner pr2 = new Scanner(System.in);
            double num1= pr2.nextDouble();
            System.out.println(Math.sqrt(num1));
            }
        else if(ex==3) {
            System.out.println("Представьтесь, пожалуйста:");
            Scanner pr3 = new Scanner(System.in);
            String name = pr3.nextLine();
            System.out.println("Здравствуйте: " + name);
        }
        else if(ex==4){
            System.out.println("Досвидания!");
            System.out.println("Bue");
            return false;
        }
            return true;
    }

}
/*
        приложение должно быть консольным (без графического интерфейса)
        после старта приложение должно выводить приветствие со списком доступных команд для ввода
        реализовать минимум 4 команды:
        вывод последовательности введенных чисел в столбик
        вычисление квадратного корня
        печать приветствия для введенного имени
        выход
        примерная логика работы
        запуск программы
        печать приветствия
        ввод команды
        ввод значений для выбранной команды
        печать результата
        ожидание ввода новой команды
        также в программе должна быть минимальная проверка на ошибки (например, чтоб не падало при вычислении корня из -1)*/
