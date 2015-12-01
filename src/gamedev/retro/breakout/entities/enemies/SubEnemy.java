package gamedev.retro.breakout.entities.enemies;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.state.StateBasedGame;

public class SubEnemy extends Enemy{

	private Image img;

	public SubEnemy(float x , float y, Image image, int strenght) {
		super(x, y, image);
		this.img = image;
		this.x = x ;
		this.y = y;
		this.strength=strenght;
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		
		WIDTH = HEIGHT = 60;
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		img.draw(x,y,WIDTH,HEIGHT);
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		
		
	}

}
