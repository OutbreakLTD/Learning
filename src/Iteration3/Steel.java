package Iteration3;

/**
 * Created by kmordvickij on 01.12.2016.
 */
public class Steel {
    public String mName=" Сталь ";
    public String name;
    Steel(String part){
        if(part.endsWith("а") ) {
            name = "Стальная " + part;
        }
        else if (part.endsWith("о")){
            name = "Стальное " + part;
        }
    };
}
