package com.example.helloworld;

/**
 * Created by kmordvickij on 25.11.2016.
 */
public class Robocount extends Mecha
{
    public void prNum(int n){
for(int i=1;i<=n;i++){
    for(int a=1; a<=i;a++) {
        System.out.print(a);
       /* prNum(n - i);*/
    }
    System.out.println();
        }

    }
}
