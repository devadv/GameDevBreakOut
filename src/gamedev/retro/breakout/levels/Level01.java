package gamedev.retro.breakout.levels;

import gamedev.retro.breakout.entities.enemies.Goomba;

import java.util.ArrayList;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Level01 extends Level {

	private ArrayList<Goomba> row;
	private ArrayList<Goomba> removelist;
	private Goomba goomba;
	// private Image image;

	public Level01() {
		super();

	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

		row = new ArrayList<>();
		row.addAll(makeRow(30, 30, 10)); //with 10 items and size block 4px framerate 638
		row.addAll(makeRow(30, 70, 10)); //framerate 280
		row.addAll(makeRow(30, 110, 10));//framerate 220
		row.addAll(makeRow(30, 150, 10));//slow on framerate between 98  - 124
		row.addAll(makeRow(30, 190, 10));
		row.addAll(makeRow(30, 230, 10));
		row.addAll(makeRow(30, 270, 10));
		row.addAll(makeRow(30, 310, 10)); // 88 fps with ball
		for (Goomba goomba : row) {
			goomba.init(gc, sbg);

		}
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

		setBackGround(g);

		for (Goomba goomba : row) {
			goomba.render(gc, sbg, g);
		}

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

	}

}
