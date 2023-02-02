package Games.Wintergames;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

/**
 * This class encapsulates - Main
 *
 * @author Jones
 * <pre>
 *          ID   Date        Description
 *          VJ   15.12.2022  New creation
 *          </pre>
 */
public class
MainGame extends BasicGame {
    private CircleActor ca1;
    private CircleActor ca2;

    private OvalActor oa1;

    private List<Actor> Snowflake;
    public MainGame(String title) {
        super(title);
    }
    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException{
        this.ca1.render(graphics);

        this.oa1.render(graphics);
        for (Games.Wintergames.Actor actor: this.Snowflake){
            actor.render(graphics);
        }

    }

    @Override
    public void init(GameContainer gc) throws SlickException{
        this.oa1 = new OvalActor(50, 70);
        MoveRight mr1 = new MoveRight(0,0,0.3f);
        this.ca1 = new CircleActor(mr1);
        this.Snowflake = new ArrayList<>();
            for(int i = 0; i < 200; i++){
                this.Snowflake.add(new Snowflake(Games.Wintergames.Snowflake.SIZE.BIG));
                this.Snowflake.add(new Games.Wintergames.Snowflake (Games.Wintergames.Snowflake.SIZE.MEDIUM));
                this.Snowflake.add(new Games.Wintergames.Snowflake(Games.Wintergames.Snowflake.SIZE.SMALL));
            }


    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException{
        this.ca1.update(gc,delta);

        this.oa1.update(gc, delta);
        for (Games.Wintergames.Actor actor: this.Snowflake){
            actor.update(gc, delta);
        }

    }

    public static void main(String[] argv){
        try {
            AppGameContainer container = new AppGameContainer((new MainGame("Wintergame")));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}
