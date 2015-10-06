package gamedev.retro.breakout.levels;

import gamedev.retro.breakout.entities.enemies.Goomba;

import java.util.ArrayList;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Level {
	
	protected ArrayList<Goomba> goombas;
	protected Image image;
	
	public Level() {
		try {
			image = new Image("res/bg.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		
		

	}
	
	
	public ArrayList<Goomba> makeRow(int x , int y, int aantal){
		ArrayList<Goomba> goombas = new ArrayList<Goomba>();
		
		for (int i= 0; i < aantal; i++) {
			goombas.add(new Goomba(x, y));
			x  +=170;
		}
		
		
		return goombas;
		
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		
		
	}
	public void setBackGround(Graphics g){
		g.drawImage(image, 0, 0);
		
		
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		

	}

}
