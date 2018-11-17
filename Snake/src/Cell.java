/**
 * 
 */

/**
 * @author 
 *
 */
public class Cell {
	private int score;
	public enum CellType{
		ITEM,WALL,EMPTY
	}
	private CellType cellType;
	
	/**
	 * Sets the type of the cell and gives a score based on the type
	 */
	public Cell(CellType cellType) {
		this.cellType = cellType;
		if (this.cellType == CellType.ITEM) {
			this.score = 100;
		}
		else {
			this.score = 0;
		}
	}

	/**
	 * @param cellType the cellType to set
	 */
	public void setCellType(CellType cellType) {
		this.cellType = cellType;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * @return the cellType
	 */
	public CellType getCellType() {
		return cellType;
	}


}
