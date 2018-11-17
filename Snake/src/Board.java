
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
	

	
}
