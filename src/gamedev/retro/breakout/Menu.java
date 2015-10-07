package gamedev.retro.breakout;

import java.awt.Font;
import java.io.InputStream;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.util.ResourceLoader;

public class Menu extends BasicGameState {

	private TrueTypeFont ttf;
	private Font awtFont;

	public Menu(int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(GameContainer container, StateBasedGame game){
	// load a default java font
		Font awtFont = new Font("emulogic", Font.BOLD, 24);
		ttf = new TrueTypeFont(awtFont, false);
	}
	

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		ttf.drawString(300,400, "Mario Break Out V1");
		
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
