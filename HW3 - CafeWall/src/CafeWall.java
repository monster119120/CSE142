/*
 * Tiarnan Marsten
 * 03 Dec, 2019
 * CSE142
 * Assignment 3
 */

import java.awt.*;

public class CafeWall {

	/** Constant for space between rows. */
	public static final int MORTAR = 2;
	
	/**
	 * Creates new panel.
	 * Draws the rows and grids.
	 * @param args
	 */
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(650,400);
		panel.setBackground(Color.GRAY);
		Graphics g = panel.getGraphics();
		drawRow(0, 0, 4, 20, g);
		drawRow(50, 70, 5, 30, g);
		drawGrid(10, 150, 4, 25, 0, g);
		drawGrid(250, 200, 3, 25, 10, g);
		drawGrid(425, 180, 5, 20, 10, g);
		drawGrid(400, 20, 2, 35, 35, g);
	}
	
	/**
	 * Draws a single row.
	 * @param x
	 * @param y
	 * @param pairs
	 * @param size
	 * @param g
	 */
	public static void drawRow(int x, int y, int pairs, int size, Graphics g) {
		for (int i = 0; i < pairs; i++) {
			g.setColor(Color.BLACK);
			g.fillRect(x + (size * i * 2), y, size, size);
			g.setColor(Color.WHITE);
			g.fillRect(x + (size * i * 2) + size, y, size, size);
			g.setColor(Color.BLUE);
			g.drawLine(x + (size * i * 2), y, x + (size * i * 2) + size, y + size);
			g.drawLine(x + (size * i * 2) + size, y, x + (size * i * 2), y + size);
		}
	}
	
	/**
	 * Draws a grid made up of rows.
	 * @param x
	 * @param y
	 * @param rows
	 * @param size
	 * @param offset
	 * @param g
	 */
	public static void drawGrid(int x, int y, int rows, int size, int offset, Graphics g) {
		for (int i = 0; i < rows * 2; i++) {
			drawRow(x + (i % 2) * offset, y + i * (size + MORTAR), rows, size, g);
		}
	}
}
