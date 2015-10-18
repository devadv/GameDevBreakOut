package gamedev.retro.breakout;

import gamedev.retro.breakout.entities.Ball;
import gamedev.retro.breakout.entities.Player;
import gamedev.retro.breakout.entities.enemies.Goomba;
import gamedev.retro.breakout.levels.Level;
import gamedev.retro.breakout.levels.Level01;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends BasicGameState {

	private Player player;
	private Level level01;
	private Music music;
//	private Music music;
	private static Ball ball;

	public Game(int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {

		level01 = new Level01();
		level01.init(gc, sbg);
		player = new Player();
		player.init(gc, sbg);
		ball = new Ball();
		ball.init(gc);
		ball.setX(player.getX() + 25);
		ball.setY(player.getY() - 10);
		music = new Music("res/Overworld.ogg");
		music.play();
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {

		level01.render(gc, sbg, g);
		player.render(gc, sbg, g);
		ball.render(gc, g);

	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		player.update(gc, sbg, delta);
		level01.update(gc, sbg, delta);
		ball.update(gc, delta);
		Input input = gc.getInput();
		if (input.isKeyPressed(Input.KEY_SPACE)) {
			System.out.println("SPACEKEY");
			ball.update(gc, delta);
			ball.moveUp();
		}

		if (ball.getBounds().intersects(player.getBounds())) {
			ball.moveUp();
		}
		for (Goomba goomba : level01.getRow()) {
			if (ball.getBounds().intersects(goomba.getBounds())) {
				System.out.println("Hit");
				level01.addRemoveList(goomba);
				ball.moveDown();
				
			}
		}
		level01.getRow().removeAll(level01.getRemoveList());
	}

	public static Ball getBall() {
		return ball;
	}

	@Override
	public int getID() {
		// TODO
		return 1;
	}

}
