package Games.dog;

/**
 * This class encapsulates - Wuff
 *
 * @author Jones
 * <pre>
 *          ID   Date        Description
 *          VJ   20.01.2023  New creation
 *          </pre>
 */
public class Wuff implements Bark {

    public Wuff (String bark){
        this.bark = bark();
    }
    @Override
    public void bark() {
        System.out.println("wuff");
    }
}
