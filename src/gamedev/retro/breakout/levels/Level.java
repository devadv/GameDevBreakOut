package gamedev.retro.breakout.levels;

import gamedev.retro.breakout.entities.Ball;
import gamedev.retro.breakout.entities.enemies.Enemy;
import gamedev.retro.breakout.entities.enemies.SubEnemy;

import java.util.ArrayList;

import javagame.retro.breakout.assets.Sprites;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.state.StateBasedGame;

public abstract class Level {

	protected ArrayList<Enemy> row;
	protected ArrayList<Enemy> removeList;
	protected static ArrayList<Enemy> Enemies;
	
	private Image image;

	public Level() throws SlickException {
		try {
			image = new Image("res/bg.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public abstract void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException;

	public ArrayList<Enemy> makeRow(int x, int y, int aantal , Image sprite) {
		ArrayList<Enemy> Enemies = new ArrayList<Enemy>();
		int strength = 0;
		for (int i = 0; i < aantal; i++) {
			Enemies.add(new SubEnemy(x, y, sprite ,strength));
			x += 75;
		}

		return Enemies;

	}
	public ArrayList<Enemy> makeRow(int x, int y, int aantal, Image sprite,
			int strength) {
		ArrayList<Enemy> Enemies = new ArrayList<Enemy>();

		for (int i = 0; i < aantal; i++) {

			Enemies.add(new SubEnemy(x, y, sprite ,strength));
			x += 75;
		}

		return Enemies;
		
	}

	public abstract void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException;

	public abstract void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException;

	public void setBackGround(Graphics g) {
		g.drawImage(image, 0, 0);
	}

	public ArrayList<Enemy> getRow() {
		return row;
	}

	public void addRemoveList(Enemy Enemy) {
		this.removeList.add(Enemy);
	}

	public ArrayList<Enemy> getRemoveList() {
		return removeList;
	}

	

}
