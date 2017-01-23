package bonus1;

/**
 * Created by kmordvickij on 19.01.2017.
 */
public enum Options {
    COLOR("Цвет :"),
    FRESH("Свежие :"),
    BATTERY("На батарейках :"),
    LENS("С линзой :"),
    GAS("Газовая :"),
    BRAND("Брендовая :"),
    TASTE("Вкус :"),
    SMELL("Запах :"),
    CONDITION("Спелые :");


    private String oName;

    Options(String oName){
        this.oName=oName;

    }

    public String getoName() {
        return oName;
    }
}
