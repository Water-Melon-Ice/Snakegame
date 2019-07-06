package snakegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel {

	public static final Random rand = new Random();

	private static final int width = 1000;
	private static final int height = 800;
	private static Image snakeimage;

	static {
		try {
			snakeimage = ImageIO.read(Panel.class.getResourceAsStream("Snake.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	/**
	 * First bracket: part of snake from 0 to 1999 (because window can only support 2000).
	 *<br>
	 * Second bracket: 0=X 1=Y coordinate.
	 */
	private int[][] snakelocation;
	/** Current lenght of snake, equals highest set first bracket of {@link Panel#snakelocation}
	 */
	private int snakelenght = 1;
	
	private int currentlyMoving = 0;
	public void setCurrentlyMoving(int currentlyMoving) {
		this.currentlyMoving = currentlyMoving;
	}
	

	/**
	 * First bracket: 0=X 1=Y coordinate.
	 */
	private int[] fruitlocation = new int[2];
	
	
	public Panel() {
		moveSnake(-1);
		setBackground(Color.black);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		placefruit();
		g.drawImage(snakeimage, fruitlocation[0] * 20, fruitlocation[1] * 20, null);

		for (int i = 0; i < snakelenght; i++) {
			if (snakelocation[i] == null)
				break;
			g.drawImage(snakeimage, snakelocation[i][0] * 20, snakelocation[i][1] * 20, null);

		}

	}

	public void placefruit() {
		fruitlocation[0] = rand.nextInt(width / 20);
		fruitlocation[1] = rand.nextInt(height / 20);
	}
	
	public void moveSnake(int direction) {
		switch(direction) {
		
		case -1:
			snakelocation = new int[2000][2];
			//X
			snakelocation[0][0] = 24;
			//Y
			snakelocation[0][1] = 17;
			break;
			
			
		case 0:
			
			break;
			
			
			
			
		case 1:
			
			break;
			
			
		case 2:
			
			break;
			
			
		case 3:
			
			break;
			
			
		case 4:
			
			break;
			
		}
		
	}
	
	public boolean hasEatenFruit() {
		if (snakelocation[0][0] == fruitlocation[0] && snakelocation[0][1] == fruitlocation[1]) {
			snakelenght++;
			snakelocation[snakelenght][0] = snakelocation[0][0];
			snakelocation[snakelenght][1] = snakelocation[0][1];
			placefruit();
			return true;
		}
		return false;
	}
	
	public boolean hasItself() {
		for(int i = 1; i < snakelenght; i++) {
			if(snakelocation[0][0] == snakelocation[i][0] && snakelocation[0][1] == snakelocation[i][1]) {
				moveSnake(-1);
			}
		}
		return false;	 
	}

}
