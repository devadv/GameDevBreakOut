package gamedev.retro.breakout.entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Rectangle;


public class Ball  {

	private float x;
	private float y;
	private float speed = 1f;
	private float width = 20;
	private float height = 20;
	private float dy;
	private float dx;
	private float lives =5;
	private boolean gameOver = false;
	

	public void init(GameContainer gc) throws SlickException {
		x = 100;
		y = 100;
		dx =speed;
		dy =speed;
	}


	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.setColor(Color.orange);
		g.fillArc(x, y, width, height, 0, 360);
		if(gameOver){
			g.drawString("Game Over",400,400);
		}
	}


	public void update(GameContainer gc, int delta) throws SlickException {

		

		if (x + speed > gc.getWidth() - width) {
			moveLeft();
		}
		if (x + speed < 0) {
			moveRight();
		}
		if (y + speed > gc.getHeight() - height) {
			if(lives > 0){
				init(gc);
				lives--;
			}else {
				gameOver =true;
			}
			
		}
		if (y + speed < 0) {
			moveDown();
		}
		move(delta);
		
	}

	public void move(int delta) {
		x += dx;
		y += dy;
	}

	public void moveDown() {
		dy = +speed;

	}

	public void moveUp() {
		dy = -speed;

	}

	public void moveLeft() {
		dx = -speed;

	}

	public void moveRight() {
		dx = speed;

	}
	
	public Circle getBounds(){
		return new Circle(x,y,width/2);
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
	


}
