package example;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Prism extends JPanel {
	
	private int x;

	
	public Prism() {
	

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//AB
		g.drawLine(100, 400, x, 400);
		g.setColor(Color.BLACK);
		
		//BC
		g.drawLine(300, 50, x, 400);
		g.setColor(Color.BLACK);
		
		//AC
		g.drawLine(100, 400, 300, 50);
		g.setColor(Color.BLACK);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	

}
