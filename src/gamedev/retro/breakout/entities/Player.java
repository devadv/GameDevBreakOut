package gamedev.retro.breakout.entities;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public class Player {

	private float x;
	private float y;
	private float WIDTH = 40;
	private float HEIGHT = 15;
	private float speed = 0.5f;
	private SpriteSheet spriteSheet;
	private Image marioLeft;
	private Image marioRight;
	private boolean isMarioLeft = false;
	private Image walkLeft;
	private Image walkRight;
	private Image walkLeft1;
	private Image walkRight1;
	private Animation movingLeft;
	private Animation movingRight;
	private boolean isMoving;

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		x = gc.getWidth() / 2;
		y = 490;
		spriteSheet = new SpriteSheet("res/MarioSheet.png", 65, 65, 2);
		marioLeft = spriteSheet.getSprite(0, 0).getScaledCopy(30, 30);
		;
		marioRight = marioLeft.getFlippedCopy(true, false);
		walkLeft = spriteSheet.getSprite(2, 0);
		walkRight = spriteSheet.getSprite(2, 0).getFlippedCopy(true, false);
		walkLeft1 = spriteSheet.getSprite(3, 0);
		walkRight1 = spriteSheet.getSprite(3, 0).getFlippedCopy(true, false);
		Image[] framesLeft = { walkLeft, walkLeft1 };
		movingLeft = new Animation(framesLeft, 100);
		Image[] framesRight = { walkRight, walkRight1 };

		movingRight = new Animation(framesRight, 100);
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		if (isMoving) {
			System.out.println("Moving!");
			if (isMarioLeft) {
				// marioLeft.draw(x, y, 2);
				movingLeft.draw(x, y);
			} else {
				// marioRight.draw(x, y, 2);
				movingRight.draw(x, y);
			}

		} else if (isMarioLeft) {
			marioLeft.draw(x, y, 2);
			System.out.println(" not moving");
		} else {
			marioRight.draw(x, y,2);
			System.out.println(" not moving");
		}

	}

	public boolean isMarioLeft() {
		return false;

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		Input input = gc.getInput();

		if (input.isKeyDown(Input.KEY_LEFT)) {
			if (x > 1) {
				x = x - speed * delta;
				isMarioLeft = true;
				isMoving = true;
			}

		} else if (input.isKeyDown(Input.KEY_RIGHT)) {
			if (x < gc.getWidth() - WIDTH) {
				x = x + speed * delta;
				isMarioLeft = false;
				isMoving = true;
			}

		} else if (input.isKeyPressed(Input.KEY_LEFT)) {
			isMoving = false;
			isMarioLeft = true;

		} else if (input.isKeyPressed(Input.KEY_RIGHT)) {
			isMoving = false;
			isMarioLeft = false;

		}

	}

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

}
