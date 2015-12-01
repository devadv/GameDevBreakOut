package gamedev.retro.breakout.levels;

import gamedev.retro.breakout.entities.enemies.Enemy;

import gamedev.retro.breakout.entities.enemies.SubEnemy;

import java.util.ArrayList;

import javagame.retro.breakout.assets.Sprites;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Level01 extends Level {

	private Sprites sprites;

	public Level01() throws SlickException {
		super();
		sprites = new Sprites();
	}

	public ArrayList<Enemy> makeRow(int x, int y, int aantal) {
		ArrayList<Enemy> Enemies = new ArrayList<Enemy>();

		for (int i = 0; i < aantal; i++) {
			if (i % 2 == 0) {
				Enemies.add(new SubEnemy(x, y, sprites.Buzzy_Beetle, 1));

			} else {
				Enemies.add(new SubEnemy(x, y, sprites.Goomba, 0));
				System.out.println("make Goomba");
			}
			x += 75;
		}

		return Enemies;

	}

	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		removeList = new ArrayList<Enemy>();
		row = new ArrayList<>();
		row.addAll(makeRow(30, 30, 10));
		row.addAll(makeRow(30, 90, 10));
		row.addAll(makeRow(30, 150, 10));
		for (Enemy enemies : row) {
			enemies.init(gc, sbg);
			// System.out.println(enemies.getX() +" " + enemies.getY());
		}

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {

		setBackGround(g);

		for (Enemy enemies : row) {
			enemies.render(gc, sbg, g);
		}

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {

		for (Enemy enemies : row) {
			enemies.update(gc, sbg, delta);
		}

	}

}
