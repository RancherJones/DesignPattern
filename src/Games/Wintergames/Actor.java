package Games.Wintergames;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * This class encapsulates - Actor
 *
 * @author Jones
 * <pre>
 *          ID   Date        Description
 *          VJ   16.12.2022  New creation
 *          </pre>
 */
public interface Actor {

    public void render(Graphics graphics);
    public void update(GameContainer gc, int delta);
}
