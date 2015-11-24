package gamedev.retro.breakout.levels;

import gamedev.retro.breakout.entities.Ball;
import gamedev.retro.breakout.entities.enemies.Enemy;
import gamedev.retro.breakout.entities.enemies.Turtle;

import java.util.ArrayList;

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
	protected Image image;
	private SpriteSheet sheet;
	protected Image Buzzy_Beetle;

	public Level() throws SlickException {
		try {
			image = new Image("res/bg.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sheet = new SpriteSheet(new Image("res/enemies.png"), 2, 2);
		Buzzy_Beetle = sheet.getSubImage(65, 65);
	}

	public abstract void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException;

	public abstract ArrayList<Enemy> makeRow(int x, int y, int aantal);

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
