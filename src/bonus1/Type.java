package bonus1;

/**
 * Created by kmordvickij on 23.01.2017.
 */
public enum Type {
    PRODUCT("Продукт"),
    ITEM("Предмет");

    private String tName;

    Type(String tName){
        this.tName=tName;
    }
    public String toString(){
        return this.tName;
    }

}
