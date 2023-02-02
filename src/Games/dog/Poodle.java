package Games.dog;

/**
 * This class encapsulates - Poodle
 *
 * @author Jones
 * <pre>
 *          ID   Date        Description
 *          VJ   20.01.2023  New creation
 *          </pre>
 */
public class Poodle extends AbstractDog {
    public Poodle(String name) {
        super(name);

    }

    @Override
    public void run() {
        System.out.println("Running: when a fox is in the bottle where the tweetle beetles battle with their paddles in a puddle on noodle-eating poodle the poodle is called: " + getName());
    }

    @Override
    public void bark() {
        this.bark();

    }
}
