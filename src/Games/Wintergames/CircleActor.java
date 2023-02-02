package Games.Wintergames;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 * This class encapsulates - CircleActor
 *
 * @author Jones
 * <pre>
 *          ID   Date        Description
 *          VJ   15.12.2022  New creation
 *          </pre>
 */
public class CircleActor implements Actor{
    private MoveRight mr;

    private int speed;

    public CircleActor(MoveRight mr){
        super();
        this.mr = mr;

    }


    @Override
    public void update(GameContainer gc, int delta) {
        mr.update(gc, delta);
    }

    @Override
    public void render(Graphics graphics){
        graphics.drawOval(this.mr.getX(), this.mr.getY(), 20, 20);
    }

}


