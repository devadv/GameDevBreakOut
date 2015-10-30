package gamedev.retro.breakout.levels;

import gamedev.retro.breakout.entities.Ball;
import gamedev.retro.breakout.entities.enemies.Goomba;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Level01 extends Level {

	public Level01(Ball ball) {
		super(ball);
		// TODO Auto-generated constructor stub
	}

	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		removeList = new ArrayList<Goomba>();
		row = new ArrayList<>();
		row.addAll(makeRow(30, 30, 10));
		row.addAll(makeRow(30, 90, 10));
		row.addAll(makeRow(30, 150, 10));
		for (Goomba goomba : row) {
			goomba.init(gc, sbg);

		}
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		super.render(gc, sbg, g);

		setBackGround(g);

		for (Goomba goomba : row) {
			goomba.render(gc, sbg, g);
		}

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		super.update(gc, sbg, delta);

		for (Goomba goomba : row) {
			goomba.update(gc, sbg, delta);
 
		}

	}

}
