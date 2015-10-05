package gamedev.retro.breakout.entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public class Block {

	private Color color;
	private int vX;
	private int vY;

	private int size;
	private ImageBuffer imgBuffer;
	private Image image;

	public Block(int vX, int vY, Color color, int size) {
		this.vX = vX;
		this.vY = vY;
		this.color = color;
		this.size = size;
	}

	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		int r = color.getRed();
		int g = color.getGreen();
		int b = color.getBlue();
		imgBuffer = new ImageBuffer(size, size);

		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				imgBuffer.setRGBA(x, y, (int)r, (int)g, (int)b, 255);
			}
		}
		image = imgBuffer.getImage();

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		g.setColor(color);
		// g.fillRect(x, y, size, size);
		// g.setColor(Color.black);
		

		image.draw(vX, vY);
		 //g.drawRect(vX, vY, size, size); / gives low frame rate

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// TODO

	}

	public Rectangle getBounds() {
		return new Rectangle(vX, vY, size, size);

	}

}
