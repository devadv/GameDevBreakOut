package gamedev.retro.breakout.levels;



import gamedev.retro.breakout.entities.enemies.Goomba;

import java.util.ArrayList;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Level01 extends Level {

	private ArrayList<Goomba> row;
	private ArrayList<Goomba> removelist;
	private Goomba goomba;

	public Level01() {
		
	}

	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		row = new ArrayList<>();
		row.addAll(makeRow(200, 30, 1));
		for (Goomba goomba:row){
			goomba.init(gc, sbg);
			
		}
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		g.setBackground(Color.gray);
		
		for (Goomba goomba:row){
			goomba.render(gc, sbg, g);
		}

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {

		

	}

}
