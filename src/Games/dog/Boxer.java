package Games.dog;

/**
 * This class encapsulates - Boxer
 *
 * @author Jones
 * <pre>
 *          ID   Date        Description
 *          VJ   20.01.2023  New creation
 *          </pre>
 */
public class Boxer extends AbstractDog{
    public Boxer(String name) {
        super(name);
    }



    @Override
    public void bark() {
        this.bark();
    }
    @Override
    public void run() {
        System.out.println("Running Boxer my name is: " + getName() + getBark());
    }
}
