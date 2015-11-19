package gamedev.retro.breakout.entities.enemies;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public abstract class Enemy {
	
	
	protected float x;
	protected float y;
	protected float WIDTH;
	protected float HEIGHT;
	
	public Enemy(float x, float y){
		this.x = x ;
		this.y = y;
		
	}
	
		public abstract void init(GameContainer gc, StateBasedGame sbg)	throws SlickException ;
		
		
		
		public abstract void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException ;
			

	

		public abstract void update(GameContainer gc, StateBasedGame sbg, int delta)throws SlickException ;

		public Rectangle getBounds() {
			return new Rectangle(x, y, WIDTH, HEIGHT);
		}

		public float getX() {
			return x;
		}

		public void setX(float x) {
			this.x = x;
		}

		public float getY() {
			return y;
		}

		public void setY(float y) {
			this.y = y;
		}

		public float getWIDTH() {
			return WIDTH;
		}

		public void setWIDTH(float wIDTH) {
			WIDTH = wIDTH;
		}

		public float getHEIGHT() {
			return HEIGHT;
		}

		public void setHEIGHT(float hEIGHT) {
			HEIGHT = hEIGHT;
		}

		
		
		
	}


