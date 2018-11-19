import java.util.Iterator;
import javax.swing.JPanel;
import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

/**
 * 
 */

/**
 * @author 
 *
 */
public class Board extends JPanel {
	private int rowSize;
	private int colSize;
	private Cell[][] cells;
  	private LinkedList<Snake> snakeBody = new LinkedList<Snake>();
	/**
	 * Generates an array of Cell with size: rowSize+1*colSize+1 so
	 * we can add the borders
	 * initializes the array with empty cells and borders
	 */
	public Board(int rowSize, int colSize) {
		this.rowSize = rowSize+2;
		this.colSize = colSize+2;
		this.cells = new Cell[this.rowSize][this.colSize];
		
		for (int i = 0; i < this.rowSize; i++) {
			for (int j = 0; j < this.colSize; j++) {
				if(i==0 || j==0 || i==this.rowSize-1 || j==this.colSize-1)
					cells[i][j] = new Cell(Cell.CellType.WALL);
				else
					cells[i][j] = new Cell(Cell.CellType.EMPTY);
			}
		}
		
		setPreferredSize(new Dimension(this.colSize * 20, this.rowSize * 20));
		setBackground(Color.BLACK);

	}
	/**
	 * @return the rowSize
	 */
	public int getRowSize() {
		return rowSize;
	}
	/**
	 * @return the colSize
	 */
	public int getColSize() {
		return colSize;
	}
	
	/**
	 *  @return the type of the specified cell
	 */
	public Cell.CellType getCell(int x, int y) {
		return cells[x][y].getCellType();
	}
	
	/**
	 *  @return true if the cell is an item
	 */
	public boolean isItem(int x, int y) {
		boolean isItem = false;
		Cell.CellType cell = cells[x][y].getCellType();
		if (cell == Cell.CellType.BIG_ITEM 
				|| cell == Cell.CellType.MED_ITEM
				|| cell == Cell.CellType.SMALL_ITEM) {
			isItem = true;
		}
		return isItem;
	}
	
	/**
	 * sets a snake head and set the cell where its located
	 * 
	 */
	public void setHead(int x, int y) {
		Snake snake = new Snake(x,y);
		cells[x][y].setCellType(Cell.CellType.SNAKE);
		this.snakeBody.addFirst(snake);
	}
	
	/**
	 * @return the head of the snake
	 * 
	 */
	public Snake getHead() {
		return this.snakeBody.getFirst();
	}
	
	/**
	 * Add one more member to the body of the snake
	 * 
	 */
	public void addBody(Controller.Direction direction) {		
		int pos_x = this.snakeBody.getLast().getX();
		int pos_y = this.snakeBody.getLast().getY();
		Snake e;
		switch (direction) {
		case UP:
			e = new Snake(pos_x, pos_y + 1);
			this.snakeBody.addLast(e);
			cells[pos_x][pos_y + 1].setCellType(Cell.CellType.SNAKE);
			break;
		case DOWN:
			e = new Snake(pos_x, pos_y - 1);
			this.snakeBody.addLast(e);
			cells[pos_x][pos_y - 1].setCellType(Cell.CellType.SNAKE);
			break;
		case LEFT:
			e = new Snake(pos_x + 1, pos_y);
			this.snakeBody.addLast(e);
			cells[pos_x + 1][pos_y].setCellType(Cell.CellType.SNAKE);
			break;
		case RIGHT:
			e = new Snake(pos_x - 1, pos_y);
			this.snakeBody.addLast(e);
			cells[pos_x - 1][pos_y].setCellType(Cell.CellType.SNAKE);
			break;
		}
		
	}
	

	/**
	 * sets the type of the cell
	 */
	public void setCells(int x, int y, Cell.CellType cellType) {
		this.cells[x][y].setCellType(cellType);;
	}
	/**
	 * 
	 */
	public void move(Controller.Direction direction) {
		int x,y;
		x = snakeBody.getFirst().getX();
		y = snakeBody.getFirst().getY();
		switch (direction) {
		case UP:
			System.out.println(cells[x][y-1].getCellType());
			snakeBody.getFirst().setPos(x, y-1);
			cells[x][y-1].setCellType(Cell.CellType.SNAKE);
			System.out.println(cells[x][y-1].getCellType());
			break;
		case DOWN:
			snakeBody.getFirst().setPos(x, y+1);
			cells[x][y+1].setCellType(Cell.CellType.SNAKE);
			break;
		case LEFT:
			snakeBody.getFirst().setPos(x-1, y);
			cells[x-1][y].setCellType(Cell.CellType.SNAKE);
			break;
		case RIGHT:
			snakeBody.getFirst().setPos(x+1, y);
			cells[x+1][y].setCellType(Cell.CellType.SNAKE);
			break;
			}

		}		
	
	
	public void update() {
		int x = snakeBody.getLast().getX();
		int y = snakeBody.getLast().getY();
		cells[x][y].setCellType(Cell.CellType.EMPTY);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(int x = 0; x < colSize; x++) {
			for(int y = 0; y < rowSize; y++) {
				Cell.CellType cell = cells[x][y].getCellType();			
				drawCell(x * 20, y * 20, cell, g);
			}
		}
		
		g.setColor(Color.DARK_GRAY);
		g.drawRect(0, 0, getWidth() - 1, getHeight());
		for(int x = 0; x < colSize; x++) {
			for(int y = 0; y < rowSize; y++) {
				g.drawLine(x * 20, 0, x * 20, getHeight());
				g.drawLine(0, y * 20, getWidth(), y * 20);
			}
		}
	}
	
	public void drawCell(int x, int y, Cell.CellType cellType, Graphics g) {
		
		
		switch(cellType) {
		case EMPTY: 
			g.setColor(Color.BLACK);
			g.fillRect(x, y, 20, 20);
			break;
		case WALL:
			g.setColor(Color.GRAY);
			g.fillRect(x, y, 20, 20);
			break;
		case SNAKE:
			g.setColor(Color.GREEN);
			g.fillRect(x, y, 20, 20);
			break;
		case SMALL_ITEM:
			g.setColor(Color.RED);
			g.fillRect(x, y, 20, 20);
			break;
		case MED_ITEM:
			g.setColor(Color.BLUE);
			g.fillRect(x, y, 20, 20);
			break;
		case BIG_ITEM:
			g.setColor(Color.YELLOW);
			g.fillRect(x, y, 20, 20);
			break;
	}

	
} }
