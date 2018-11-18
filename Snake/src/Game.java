/**
 * 
 */

/**
 * @author 
 *
 */
public class Game {
	private Board board;
	
	public Game(int rowSize, int colSize) {
		start(rowSize, colSize);
	}
	
	/**
	 * Game start
	 */
	public void start(int rowSize, int colSize) {
		board = new Board(rowSize, colSize);
		board.setHead((int) (rowSize/2), (int) (colSize/2));
		board.setCells((int)(Math.random() * rowSize), (int)(Math.random() * colSize), Cell.CellType.ITEM);
		play();
	}
	
	public void play() {
		
	}
	
	/**
	 * @return if the snake has collided or not
	 */
	public boolean CheckCollision(Controller.Direction direction) {
		int pos_X = board.getHead().getX();
		int pos_Y = board.getHead().getY();
		boolean collision = false;
		switch (direction) {
		case UP:
			if (board.getCell(pos_X, pos_Y - 1) == Cell.CellType.WALL) {
				collision = true;
			}
			break;
		case DOWN:
			if (board.getCell(pos_X, pos_Y + 1) == Cell.CellType.WALL) {
				collision = true;
			}
			break;
		case LEFT:
			if (board.getCell(pos_X - 1, pos_Y) == Cell.CellType.WALL) {
				collision = true;
			}
			break;
		case RIGHT:
			if (board.getCell(pos_X + 1, pos_Y) == Cell.CellType.WALL) {
				collision = true;
			}
			break;
		}
		
		return collision;
	}
}