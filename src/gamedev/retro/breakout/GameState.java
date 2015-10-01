package gamedev.retro.breakout;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class GameState extends StateBasedGame {

	public GameState(String name) {
		super(name);
		// TODO Auto-generated constructor stub

	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		addState(new Menu(0));
		addState(new Game(1));
		enterState(1);

	}

	public static void main(String[] args) {
		try {
			AppGameContainer appgc;
			appgc = new AppGameContainer(new GameState("RetroBreakOut"));
			appgc.setTargetFrameRate(60);
			appgc.setDisplayMode(1000, 562, false);
			appgc.start();
		} catch (SlickException ex) {
			Logger.getLogger(GameState.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}