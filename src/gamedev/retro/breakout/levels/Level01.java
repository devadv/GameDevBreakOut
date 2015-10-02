package gamedev.retro.breakout.levels;



import gamedev.retro.breakout.entities.enemies.Goomba;

import java.util.ArrayList;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Level01 extends Level {

	private ArrayList<Goomba> row;
	private ArrayList<Goomba> removelist;
	private Goomba goomba;
	private Image image;

	public Level01() {
		super();
		
	}

	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		image = new Image("res/bg.png");
		row = new ArrayList<>();
		row.addAll(makeRow(200, 30, 1));
		for (Goomba goomba:row){
			goomba.init(gc, sbg);
			
		}
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		
		g.setBackground(Color.blue);
		//g.drawImage(image, 0, 0);
		
		for (Goomba goomba:row){
			goomba.render(gc, sbg, g);
		}

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {

		

	}

}
