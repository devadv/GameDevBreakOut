package gamedev.retro.breakout.entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public class Block {

	private Color color;
	private float y;
	private float x;
	private float size;

	public Block(float x, float y, Color color,float size) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.size = size;
	}

	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		g.setColor(color);
		g.fillRect(x, y, size, size);
		g.setColor(Color.black);
		g.drawRect(x, y, size, size);

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// TODO

	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, size, size);

	}

}
