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
		int size = 15;
		row.addAll(makeRow(x, y, 4, size, new Color(243 , 153,90)));
		row.addAll(makeRow(x-size, y+size, 6, size,new Color(243,153,90)));
		row.addAll(makeRow(x-size*2, y+(size*2), 8, size, new Color(243,153,90)));
		row.addAll(makeRow(x-size*3, y+(size*3), 10, size,new Color(243,153,90)));
		//begin row 5
		Color[]colorRow5 = new Color[12];
		colorRow5[0]= new Color(243,153,90);
		colorRow5[1]= new Color(75,59,60);
		colorRow5[2]= new Color(75,59,60);
		colorRow5[3]= new Color(243,153,90);
		colorRow5[4]= new Color(243,153,90);
		colorRow5[5]= new Color(243,153,90);
		colorRow5[6]= new Color(243,153,90);
		colorRow5[7]= new Color(243,153,90);
		colorRow5[8]= new Color(243,153,90);
		colorRow5[9]= new Color(75,59,60);
		colorRow5[10]= new Color(75,59,60);
		colorRow5[11]= new Color(243,153,90);
		row.addAll(makeRow(x-size*4, y+size*4 , 12, size, colorRow5));
		//end row 5
		//begin row 6
		Color[] colorRow6 = new Color[14];
		colorRow6[0]= new Color(243,153,90);
		colorRow6[1]= new Color(243,153,90);
		colorRow6[2]= new Color(243,153,90);
		colorRow6[3]= new Color(234,219,180);
		colorRow6[4]= new Color(75,59,60);
		colorRow6[5]= new Color(243,153,90);
		colorRow6[6]= new Color(243,153,90);
		colorRow6[7]= new Color(243,153,90);
		colorRow6[8]= new Color(243,153,90);
		colorRow6[9]= new Color(75,59,60);
		colorRow6[10]= new Color(234,219,180);
		colorRow6[11]= new Color(243,153,90);
		colorRow6[12]= new Color(243,153,90);
		colorRow6[13]= new Color(243,153,90);
		row.addAll(makeRow(x-size*5, y+size*5 , 14, size, colorRow6));
		//end row 6
		//begin row 7
		Color[] colorRow7 = new Color[14];
		colorRow7[0]= new Color(243,153,90); 
		colorRow7[1]= new Color(243,153,90);
		colorRow7[2]= new Color(243,153,90);
		
		//whiteBlock
		colorRow7[3]= new Color(234,219,180);
		
		//BrownBlock
		colorRow7[4]= new Color(75,59,60);
		colorRow7[5]= new Color(75,59,60);
		colorRow7[6]= new Color(75,59,60);
		colorRow7[7]= new Color(75,59,60);
		colorRow7[8]= new Color(75,59,60);
		colorRow7[9]= new Color(75,59,60);
	
		//BeigeBlock
		colorRow7[10]= new Color(234,219,180);
		colorRow7[11]= new Color(243,153,90);
		colorRow7[12]= new Color(243,153,90);
		colorRow7[13]= new Color(243,153,90);
		row.addAll(makeRow(x-size*5, y+size*6 , 14, size, colorRow7));
		
		//begin row 8
		Color[] colorRow8 = new Color[16];
		colorRow8[0]= new Color(243,153,90);
		colorRow8[1]= new Color(243,153,90);
		colorRow8[2]= new Color(243,153,90);
		colorRow8[3]= new Color(243,153,90);
		colorRow8[4]= new Color(234,219,180);
		colorRow8[5]= new Color(75,59,60);
		colorRow8[6]= new Color(234,219,180);
		colorRow8[7]= new Color(243,153,90);
		colorRow8[8]= new Color(243,153,90);
		colorRow8[9]= new Color(234,219,180);
		colorRow8[10]= new Color(75,59,60);
		colorRow8[11]= new Color(234,219,180);
		colorRow8[12]= new Color(234,219,180);
		colorRow8[13]= new Color(243,153,90);
		colorRow8[14]= new Color(243,153,90);
		colorRow8[15]= new Color(243,153,90);
		
		row.addAll(makeRow(x-size*+6, y+size*7 ,16, size, colorRow8));
		
		
	
	
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
