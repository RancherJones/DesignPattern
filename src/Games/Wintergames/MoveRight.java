package Games.Wintergames;

import org.newdawn.slick.GameContainer;

/**
 * This class encapsulates - MoveRight
 *
 * @author Jones
 * <pre>
 *          ID   Date        Description
 *          VJ   16.12.2022  New creation
 *          </pre>
 */
public class MoveRight {
    private float x;
    private float y;

    private float speed;


    public MoveRight(float x, float y, float speed){
        super();
        this.x = x;
        this.y = y;
        this.speed = speed;

    }

    public void update(GameContainer gc, int delta){
        this.x += delta * speed;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
