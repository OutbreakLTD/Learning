package com.example.helloworld;

/**
 * Created by kmordvickij on 25.11.2016.
 */
public class Mecha {
    public String name;
    public double x;
    public double y;
    boolean turn;

    public void status (boolean a)
    {
        if (a==true){
            turn=true;
            System.out.println(name + " активирован в координатах "+x+":"+y);
        }
        else {
            turn=false;
            System.out.println(name + " деактивирован в координатах "+x+":"+y);
        }
    };
    private void move (double a, double b){
        if(turn==true) {
            x = a;
            y = b;
        }
        else
        {
            System.out.println(name + " деактивирован и не может двигаться");
        }
    }

    protected void coord (){
        System.out.println("Текущие координаты \n x: "+x+"\n y: "+y);
    }

    public Mecha() {
        x=0.0;
        y=0.0;
        turn=false;
    }

    public Mecha(double a, double b) {
        x=a;
        y=b;
    }
    public Mecha(double a, double b, String n){
        name=n;
        x=a;
        y=b;
    }
}
