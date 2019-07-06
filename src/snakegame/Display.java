package snakegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display extends JFrame implements KeyListener {
	public static void main(String[] args) {
		Display d = new Display();
		d.setVisible(true);
	}

	private static final int width = 1000;
	private static final int height = 800;
	public final JPanel panel;
	
	

	private Display() {
		addKeyListener(this);
		setResizable(false);

		panel = new Panel();

		add(panel);
		setSize(width, height);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyCode()) {
		case(KeyEvent.VK_W):
			
			break;
		
		case(KeyEvent.VK_A):
			
			break;
			
		case(KeyEvent.VK_S):
			
			break;
		
		case(KeyEvent.VK_D):
			
			break;
		
		
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
	
}
