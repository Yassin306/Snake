import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 */

/**
 * @author 
 *
 */
public class Board {
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
		this.rowSize = rowSize+1;
		this.colSize = colSize+1;
		this.cells = new Cell[this.rowSize][this.colSize];
		
		for (int i = 0; i < this.rowSize; i++) {
			for (int j = 0; j < this.colSize; j++) {
				if(i==0 || j==0 || i==this.rowSize-1 || j==this.colSize-1)
					cells[i][j] = new Cell(Cell.CellType.WALL);
				else
					cells[i][j] = new Cell(Cell.CellType.EMPTY);
			}
		}

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
	 * sets a snake head and set the cell where its located
	 * 
	 */
	public void setHead(int x, int y) {
		Snake snake = new Snake(x,y);
		cells[x][y].setCellType(Cell.CellType.SNAKE);
		this.snakeBody.addFirst(snake);
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
		for (Iterator<Snake> iterator = snakeBody.iterator(); iterator.hasNext();) {
			Snake snake = iterator.next();
			x = snake.getX();
			y = snake.getY();
			switch (direction) {
			case UP:
				snake.setPos(x, y-1);
				break;
			case DOWN:
				snake.setPos(x, y+1);
				break;
			case LEFT:
				snake.setPos(x-1, y);
				break;
			case RIGHT:
				snake.setPos(x+1, y);
				break;
			}

		}		
	}

	
}
