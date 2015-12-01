package gamedev.retro.breakout.levels;

import gamedev.retro.breakout.entities.enemies.Enemy;
import gamedev.retro.breakout.entities.enemies.SubEnemy;

import java.util.ArrayList;

import javagame.retro.breakout.assets.Sprites;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
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
		//een enemy op positie x = 30 y = 30 met afbeelding Buzzy Beetle en een kracht van 1 (strength)
		//dat betekent 2x raken
		row.add(new SubEnemy(30, 30, sprites.Buzzy_Beetle, 1));
		//enemy positie x = 120 en y = 30 met een strenght van 2 dat betekent 3x raken
		row.add(new SubEnemy(120, 30, sprites.Buzzy_Beetle, 2));
		//enemy positie x = 200 met afbeelding mario en strength 3 betekent 4 x raken
		row.add(new SubEnemy(200, 30, sprites.Mario, 3));
		//makeRow(int x, int y, int aantal, Image sprite, int strength) een rij met 
		//4 enemies van het type coin en strength van 2 = 3 x raken
		row.addAll(makeRow(30, 100, 4, sprites.Coin,2));
		//makeRow(int x, int y, int aantal, Image sprite)
		row.addAll(makeRow(320, 100 , 4, sprites.fishGray));
		//makeRow(int x, int y, int aantal, Image sprite, int strength)
		row.addAll(makeRow(30, 170, 4, sprites.Coin,2));
		
		for (Enemy enemy : row) {
			enemy.init(gc, sbg);
			System.out.println(enemy.getX() + " " + enemy.getY());
		}

	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		setBackGround(g);
		for (Enemy enemy : row) {
			enemy.render(gc, sbg, g);
		}

	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		for (Enemy enemy : row) {
			enemy.update(gc, sbg, delta);
		}

	}

}
