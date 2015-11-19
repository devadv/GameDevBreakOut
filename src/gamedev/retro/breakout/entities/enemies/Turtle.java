package gamedev.retro.breakout.entities.enemies;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Turtle extends Enemy{

	private Image turtle;

	public Turtle(float x , float y) {
		super(x, y);
		this.x = x ;
		this.y = y;
		
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		turtle = new Image("res/turtle.png");
		WIDTH = HEIGHT = 60;
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		turtle.draw(x,y,WIDTH,HEIGHT);
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		
		
	}

}
