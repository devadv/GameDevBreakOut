package gamedev.retro.breakout.entities.enemies;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Goomba extends Enemy {

	private Image goomba;

	public Goomba(float x, float y, Image image) {
		super(x, y, image);
		this.x = x ;
		this.y = y;
		this.goomba = image;
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		goomba = new Image("res/goomba.png");
		WIDTH = HEIGHT = 60;

	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		goomba.draw(x, y, WIDTH, HEIGHT);

	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// TODO Auto-generated method stub

	}

}
