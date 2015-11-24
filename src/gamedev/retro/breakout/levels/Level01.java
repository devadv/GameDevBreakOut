package gamedev.retro.breakout.levels;

import gamedev.retro.breakout.entities.Ball;
import gamedev.retro.breakout.entities.enemies.Enemy;
import gamedev.retro.breakout.entities.enemies.Goomba;
import gamedev.retro.breakout.entities.enemies.Turtle;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Level01 extends Level {

	public Level01() throws SlickException {
		super();

	}
	public ArrayList<Enemy> makeRow(int x, int y, int aantal) {
		ArrayList<Enemy> Enemies = new ArrayList<Enemy>();

		for (int i = 0; i < aantal; i++) {
			if(i%2==0){
			Enemies.add(new Turtle(x,y, Buzzy_Beetle));
			}else{
				Enemies.add(new Goomba(x,y, Buzzy_Beetle));
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
		for (Enemy turtle : row) {
			turtle.init(gc, sbg);
			System.out.println(turtle.getX() +" " + turtle.getY());
		}
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {

		setBackGround(g);

		for (Enemy turtle : row) {
			turtle.render(gc, sbg, g);
		}

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {

		for (Enemy turtle : row) {
			turtle.update(gc, sbg, delta);
		}

	}

}
