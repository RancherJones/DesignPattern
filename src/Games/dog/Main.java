package Games.dog;

/**
 * This class encapsulates - Main
 *
 * @author Jones
 * <pre>
 *          ID   Date        Description
 *          VJ   20.01.2023  New creation
 *          </pre>
 */
public class Main {
    public static void main(String[] args) {
        Boxer b1 = new Boxer("susie");
        Poodle p1 = new Poodle("elanor");

        b1.run();
        p1.run();
    }
}
