package gamedev.retro.breakout.levels;

import gamedev.retro.breakout.entities.enemies.Enemy;
import gamedev.retro.breakout.entities.enemies.Goomba;
import gamedev.retro.breakout.entities.enemies.SubEnemy;

import java.util.ArrayList;

import javagame.retro.breakout.assets.Sprites;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Level02 extends Level {

	private Sprites sprites;

	public Level02() throws SlickException {
		super();
		sprites = new Sprites();
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		removeList = new ArrayList<Enemy>();
		row = new ArrayList<>();
		row.add(new SubEnemy(30,30, sprites.Buzzy_Beetle,1));
		row.add(new SubEnemy(120,30, sprites.Buzzy_Beetle,2));
		row.add(new SubEnemy(200,30, sprites.Mario,3));
		for (Enemy goomba : row) {
			goomba.init(gc, sbg);
			System.out.println(goomba.getX() +" " + goomba.getY());
		}

	}

	@Override
	public ArrayList<Enemy> makeRow(int x, int y, int aantal) {
		ArrayList<Enemy> Enemies = new ArrayList<Enemy>();

		for (int i = 0; i < aantal; i++) {
		
			Enemies.add(new Goomba(x,y,sprites.Goomba));
			x += 75;
		}

		return Enemies;

	
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		setBackGround(g);
		for (Enemy goomba : row) {
			goomba.render(gc, sbg, g);
		}


	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		for (Enemy goomba : row) {
			goomba.update(gc, sbg, delta);
		}


	}

}
