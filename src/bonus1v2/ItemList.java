package bonus1v2;

/**
 * Created by kmordvickij on 07.02.2017.
 */
public enum ItemList {
    FLASHLIGHT( new Flashlight()),
    ORANGE(new Orange()),
    ZIPPO(new Zippo()),
    SODA(new Soda());
    private Items o;
    ItemList(Items o){
        this.o=o;
    }

    public Items getO() {
        return o;
    }
}
