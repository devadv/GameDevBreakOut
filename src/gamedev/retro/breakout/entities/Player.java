package gamedev.retro.breakout.entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public class Player {
	
	
	
	private float x;
	private float y;
	private float WIDTH = 70;
	private float HEIGHT = 15;
	private float speed = 0.5f;

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
			x = gc.getWidth()/2;
			y = 535;

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		g.setColor(Color.red);
		g.fillRect(x, y, WIDTH, HEIGHT);
		

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		Input input = gc.getInput();

		if (input.isKeyDown(Input.KEY_LEFT)) {
			if (x >1){
				x = x - speed * delta;
			}

		}
		if (input.isKeyDown(Input.KEY_RIGHT)) {
			if (x<gc.getWidth()-WIDTH){
				x =x + speed * delta;
			}
		

		}

	}
	
	public Rectangle getBounds(){
		return new Rectangle(x,y,WIDTH, HEIGHT);
		
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
