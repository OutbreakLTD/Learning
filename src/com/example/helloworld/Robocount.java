package com.example.helloworld;

/**
 * Created by kmordvickij on 25.11.2016.
 */
public class Robocount extends Mecha {
    public void prNum(int max) {
        prNum(1,max);
    }
    private void prNum(int curMax, int max) {
        for (int i = 1; i <= curMax; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        if (curMax < max) {
            prNum(curMax + 1, max);
        }
    }
    public void countStatus()
    {
        System.out.println("Вывод окончен");
        status(false);
    }
    public Robocount (String name){
        this.name=name;
    }
/*for(int i=1;i<=n;i++){
    for(int a=1; a<=i;a++) {
        System.out.print(a);
       *//* prNum(n - i);*//*
    }
    System.out.println();
        }

    }*/
}
