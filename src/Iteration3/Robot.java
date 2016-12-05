package Iteration3;

/**
 * Created by kmordvickij on 01.12.2016.
 */
public class Robot {
    public Arm lArm;
    public Arm rArm;
    public Leg lLeg;
    public Leg rLeg;
    public Body b;
    public Head h;
    int w;

    public int Weight(){

        w = h.weight+b.weight+lArm.weight+rArm.weight+lLeg.weight+rLeg.weight;
        return w;
    }

    public void Print(){
        System.out.println("Общий вес робота: "+Weight());
      System.out.println(lArm.fullname +lArm.material + lArm.weight + "\n"+ rArm.fullname +rArm.material+ rArm.weight + "\n"+b.fullname+b.material+b.weight+ "\n"+h.fullname+h.material+h.weight + "\n"+lLeg.fullname+ lLeg.material + lLeg.weight + "\n"+ rLeg.fullname+ rLeg.material+ rLeg.weight   );
    }

    public void rePartition(){
        if(w>0 ){
        w=w/2;
System.out.println("Общий вес снижен. Новый общий вес: "+w);
            rePartition();
        }
        else{
            System.out.println("Дальше снижать нельзя");

        }

    }

    Robot (){
        lArm = new Arm();
        rArm = new Arm();
        rLeg = new Leg();
        lLeg = new Leg();
        b = new Body();
        h = new Head();
    };



}
