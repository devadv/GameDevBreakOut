package gamedev.retro.breakout.entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;


public class Ball  {

	private float x;
	private float y;
	private float speed = 3.5f;
	private float width = 10;
	private float height = 10;
	private float dy;
	private float dx;
	private float lives =3;
	private boolean gameOver = false;
	private boolean isMovingLeft = false;
	private boolean isMovingUp = false;

	public void init(GameContainer gc) throws SlickException {
		x = 500;
		y = 200;
		dx =speed;
		dy =speed;
	}


	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
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
		setMovingUp(false);
		dy = +speed;

	}

	public void moveUp() {
		setMovingUp(true);
		dy = -speed;

	}

	public void moveLeft() {
		dx = -speed;
		setMovingLeft(true);
	}

	public void moveRight() {
		dx = speed;
		setMovingLeft(false);


	}
	
	public Rectangle getBounds(){
		return new Rectangle(x,y,width,height);
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


	public boolean isMovingUp() {
		return isMovingUp;
	}


	public void setMovingUp(boolean isMovingUp) {
		this.isMovingUp = isMovingUp;
	}


	public boolean isMovingLeft() {
		return isMovingLeft;
	}


	public void setMovingLeft(boolean isMovingLeft) {
		this.isMovingLeft = isMovingLeft;
	}
	


}
