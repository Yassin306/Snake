/**
 * 
 */

/**
 * @author 
 *
 */
public abstract class Cell {
	private int x;
	private int y;
	private int score;
	public enum CellType{
		ITEM,WALL,SNAKE_BODY,SNAKE_HEAD,EMPTY
	}
	private CellType cellType;
	
	/**
	 * 
	 */
	public Cell(int x, int y, int score, CellType cellType) {
		this.x = x;
		this.y = y;
		this.score = score;
		this.cellType = cellType;
	}

	/**
	 * @param cellType the cellType to set
	 */
	public void setCellType(CellType cellType) {
		this.cellType = cellType;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
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
