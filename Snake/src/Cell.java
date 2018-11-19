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
		SMALL_ITEM, MED_ITEM, BIG_ITEM, WALL, EMPTY, SNAKE
	}
	private CellType cellType;
	
	/**
	 * Sets the type of the cell and gives a score based on the type
	 */
	public Cell(CellType cellType) {
		this.cellType = cellType;
		switch (cellType) {
		case EMPTY:
			this.score=10;			
			break;
		case SMALL_ITEM:
			this.score=30;			
			break;
		case MED_ITEM:
			this.score=50;			
			break;
		case BIG_ITEM:
			this.score=100;			
			break;	
		default:
			this.score=0;
			break;
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
