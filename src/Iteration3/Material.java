package Iteration3;

/**
 * Created by kmordvickij on 02.12.2016.
 */
abstract class Material {
    public int weight;
    public String part;
    public String material;
    public String fullname;

    public void getMaterial(String part) {
        this.part = part;
        weight = (int) (Math.random() * 30) + 1;
        if (weight < 10) {
            Plastic p = new Plastic(this.part);
            fullname = p.name;
            material = p.mName;

        } else if (weight >= 10 && weight < 21) {
            Steel p = new Steel(this.part);
            fullname = p.name;
            material = p.mName;
        } else {
            CastIron p = new CastIron(this.part);
            fullname = p.name;
            material = p.mName;
        }
        ;


    }
}
