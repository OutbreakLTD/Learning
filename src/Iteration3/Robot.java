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

    public int Weight() {

        w = h.materials.mWeight() + b.materials.mWeight() + lArm.materials.mWeight() + rArm.materials.mWeight() + lLeg.materials.mWeight() + rLeg.materials.mWeight();
        return w;
    }

    public void Print() {
        System.out.println("Общий вес робота: " + Weight());
        System.out.println(lArm.toString());
        System.out.println(rArm.toString());
        System.out.println(b.toString());
        System.out.println(h.toString() );
        System.out.println(lLeg.toString());
        System.out.println(rLeg.toString());

    }

    public void rePartition(int w) {

        if (w > 0) {
            w = w / 2;
            System.out.println("Общий вес снижен. Новый общий вес: " + w);
            rePartition(w);
        } else {
            System.out.println("Дальше снижать нельзя");

        }

    }

    Robot() {
        lArm = new Arm();
        rArm = new Arm();
        b = new Body();
        h = new Head();
        lLeg = new Leg();
        rLeg = new Leg();


    }

    ;


}
