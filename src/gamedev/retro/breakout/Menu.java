package gamedev.retro.breakout;

import java.awt.Font;
import java.io.InputStream;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.util.ResourceLoader;

public class Menu extends BasicGameState {

	private TrueTypeFont ttf;
	private Font awtFont;
	private Image image;
	private Image image1;

	public Menu(int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(GameContainer container, StateBasedGame game) {
		// load a default java font
		Font awtFont = new Font("emulogic", Font.BOLD, 24);
		ttf = new TrueTypeFont(awtFont, false);

		try {
			image = new Image("res/menu.png");
			image1 = new Image("res/menuItem.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		image.draw(0,0,800,600);
		image1.draw(280,385);
		ttf.drawString(300, 375, "Start");
		ttf.drawString(300, 415, "Hightscore");
		ttf.drawString(300, 460, "Credits");

	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		// TODO

	}

	@Override
	public int getID() {
		// TODO
		return 0;
	}

}
