import java.util.ArrayList;
import java.util.Collection;


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
	private Collection<Cell> activeCells = new ArrayList<Cell>();
	/**
	 * 
	 */
	public Board(int rowSize, int colSize) {
		this.rowSize = rowSize;
		this.colSize = colSize;
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
	
}
