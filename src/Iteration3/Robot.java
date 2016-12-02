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

    public void weight(){
      System.out.print(lArm.material + lArm.weight + "\n"+ rArm.material+ rArm.weight + "\n"+b.material+b.weight+ "\n"+h.material+h.weight + "\n"+ lLeg.material + lLeg.weight + "\n"+ rLeg.material+ rLeg.weight   );
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
