/**
 * 
 */

/**
 * @author 
 *
 */
public class Game {
	
	public Game(int rowSize, int colSize) {
		start(rowSize, colSize);
	}
	
	public void start(int rowSize, int colSize) {
		Board board = new Board(rowSize, colSize);
		board.setHead((int) (rowSize/2), (int) (colSize/2));
		board.setCells((int)(Math.random() * rowSize), (int)(Math.random() * colSize), Cell.CellType.ITEM);
		play();
	}
	
	public void play() {
		
	}
}