package gamedev.retro.breakout.entities.enemies;

import gamedev.retro.breakout.entities.Block;

import java.util.ArrayList;

import org.newdawn.slick.Color;

public class CreateGoomba {

	protected float y;
	protected float x;

	public CreateGoomba(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public ArrayList<Block> makeRow(float x, float y, int aantal, int size,
			Color color) {
		ArrayList<Block> blocks = new ArrayList<Block>();

		for (int i = 0; i < aantal; i++) {
			blocks.add(new Block(x, y, color, size));
			x += size;
		}

		return blocks;

	}

	public ArrayList<Block> makeRow(float x, float y, int aantal, int size,
			Color[] color) {
		ArrayList<Block> blocks = new ArrayList<Block>();

		for (int i = 0; i < aantal; i++) {
			blocks.add(new Block(x, y, color[i], size));
			x += size;
		}

		return blocks;

	}

}
