package Iteration3;


/**
 * Created by kmordvickij on 02.12.2016.
 */
public class Arm {
    public String material;
    public int weight;
    public void getMaterial()
    {
        weight=(int) (Math.random()*30)+1;
        if(weight<10)
        {material="Пластик";}
        else if(weight>=10 && weight<21)
        {material="Сталь";}
        else {material="Чугуний";};


    }
    Arm (){
        getMaterial();
    }
}
