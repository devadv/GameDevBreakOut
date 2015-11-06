package gamedev.retro.breakout.levels;

import gamedev.retro.breakout.entities.Ball;
import gamedev.retro.breakout.entities.enemies.Goomba;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Level {

	protected ArrayList<Goomba> row;
	protected ArrayList<Goomba> removeList;
	protected static ArrayList<Goomba> goombas;
	protected Image image;
	private Ball ball;
	private boolean pause = false;
	//private Music music;
	
	public Level(Ball ball) {
		this.ball = ball;
		try {
			image = new Image("res/bg.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
//		music = new Music("res/Overworld.ogg");
//		music.play();

	}

	public ArrayList<Goomba> makeRow(int x, int y, int aantal) {
		ArrayList<Goomba> goombas = new ArrayList<Goomba>();

		for (int i = 0; i < aantal; i++) {
			goombas.add(new Goomba(x, y));
			x += 80;
		}

		return goombas;

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		if(pause){
			g.drawString("Pause", 400, 400);
		}
 

	}

	public void setBackGround(Graphics g) {
		g.drawImage(image, 0, 0);

	}

	// added pause sound 
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		Input input = gc.getInput();
		if(input.isKeyPressed(Input.KEY_ESCAPE)){
			ball.isStopBall();
			System.out.println("Pause");
			pause = true;
			System.out.println("Pause"+pause);
//			music = new Music("res/Mario_pause.ogg");
//			music.play();
		}

	}

	public ArrayList<Goomba> getRow() {
		return row;
	}

	public void addRemoveList(Goomba goomba) {

		this.removeList.add(goomba);

	}

	public ArrayList<Goomba> getRemoveList() {

		return removeList;
	}

}
