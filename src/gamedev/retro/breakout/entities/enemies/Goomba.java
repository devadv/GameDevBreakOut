package gamedev.retro.breakout.entities.enemies;

import gamedev.retro.breakout.entities.Block;

import java.util.ArrayList;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Goomba extends Enemy{

	private ArrayList<Block> row;

	public Goomba(float x, float y) {
		super(x, y);
		
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		row = new ArrayList<>();
		int size = 10;
		row.addAll(makeRow(x, y, 4, size, new Color(243 , 153,90)));
		row.addAll(makeRow(x-size, y+size, 6, size,new Color(243,153,90)));
		row.addAll(makeRow(x-size*2, y+(size*2), 8, size, new Color(243,153,90)));
		row.addAll(makeRow(x-size*3, y+(size*3), 10, size,new Color(243,153,90)));
		//begin row 5
		row.addAll(makeRow(x-size*4, y+(size*4), 1, size,new Color(243,153,90)));
		
		//end row 5
	
	
	}

	

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		for (Block block : row) {
			block.render(gc, sbg, g);

		}

		
		
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		

	}

}
