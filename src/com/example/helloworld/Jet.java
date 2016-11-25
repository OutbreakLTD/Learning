package com.example.helloworld;

/**
 * Created by kmordvickij on 25.11.2016.
 */
public class Jet extends Mecha {
    private void move (double a, double b){
        if(turn==true) {
            x = a;
            y = b;
        }
        else
        {
            System.out.println(name + " деактивирован и не может лететь");
        }
    }
    public void fly (int a, int b){

        this.move(x+a, y+b);
        this.coord();
    }


}
