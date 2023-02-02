package Games.dog;

/**
 * This class encapsulates - AbstractDog
 *
 * @author Jones
 * <pre>
 *          ID   Date        Description
 *          VJ   20.01.2023  New creation
 *          </pre>
 */
public abstract class AbstractDog implements Dog, Bark{
    private String name;
    private String bark;

    public AbstractDog(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }
}
