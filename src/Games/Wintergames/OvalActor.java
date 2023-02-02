package Games.Wintergames;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * This class encapsulates - OvalActor
 *
 * @author Jones
 * <pre>
 *          ID   Date        Description
 *          VJ   15.12.2022  New creation
 *          </pre>
 */
public class OvalActor {
    private double x,y;

    public OvalActor(double x, double y){
        super();
        this.x = x;
        this.y = y;
    }



    public void update(GameContainer gc, int delta) {
        this.x++;
    }


    public void render(Graphics graphics){
        graphics.drawOval((float)this.x, (float)this.y, 20, 10);
    }

}
