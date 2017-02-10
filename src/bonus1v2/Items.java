package bonus1v2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kmordvickij on 07.02.2017.
 */
public abstract class Items {
    int maxWeight;
    int minWeight;
    private int weight;
    String type;
    String name;
    private ArrayList<BaseSpecification> specifications = new ArrayList<>();

    public Items(String type, String name, int minWeight, int maxWeight) {
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.type = type;
        this.name = name;
        this.weight = new Random().nextInt((this.maxWeight-this.minWeight)+1)+this.minWeight;
    }

    int getWeight(){
        return weight;
    }
    final String getName(){
        return name;
    }

    final String getType(){
        return type;
    }

    public ArrayList<BaseSpecification> getSpecifications() {
        return specifications;
    }
    public String toString(){
        String spec=this.getType()+"\n"+this.getName()+"\n"+"Вес"+"\n"+this.getWeight();
        for (int i = 0; i<getSpecifications().size();i++){
            spec=spec+"\n"+getSpecifications().get(i).getName()+"\n"+getSpecifications().get(i).getValue()+"\n";
        }
        return spec;
    }
}
