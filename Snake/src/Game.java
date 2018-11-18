import java.util.Scanner;

/**
 * 
 */

/**
 * @author 
 *
 */
public class Game {
	private Board board;
	private int rowSize;
	private int colSize;
	private Controller con = new Controller();
	private Score score = new Score();
	private static final int OBJECTIVE_SCORE= 10;
	private long startTime;
	private long finishTime;
	
	public Game(int rowSize, int colSize) {
		this.rowSize = rowSize;
		this.colSize = colSize;
		start();
	}
	
	/**
	 * Game start
	 */
	public void start() {
		board = new Board(rowSize, colSize);
		board.setHead((int) (rowSize/2), (int) (colSize/2));
		board.setCells((int)(Math.random() * rowSize), (int)(Math.random() * colSize), Cell.CellType.ITEM);
		startTime = System.currentTimeMillis();
		play(con.getDirection());
	}
	
	public void play(Controller.Direction direction) {
		do {
			CheckObjective(direction);
			
			board.move(direction);
			board.update();
			
		} while(CheckCollision(direction));
		GameOver();
		
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
	
	/**
	 * look if the snake has collected the objective
	 * and create a new Objective
	 */
	public void CheckObjective(Controller.Direction direction) {
		int pos_X = board.getHead().getX();
		int pos_Y = board.getHead().getY();
		switch (direction) {
		case UP:
			if (board.getCell(pos_X, pos_Y - 1) == Cell.CellType.ITEM) {
				board.addBody(direction);
				NewObjective();
				score.addScore(OBJECTIVE_SCORE);
			}
			break;
		case DOWN:
			if (board.getCell(pos_X, pos_Y + 1) == Cell.CellType.ITEM) {
				board.addBody(direction);
				NewObjective();
				score.addScore(OBJECTIVE_SCORE);
			}
			break;
		case LEFT:
			if (board.getCell(pos_X - 1, pos_Y) == Cell.CellType.ITEM) {
				board.addBody(direction);
				NewObjective();
				score.addScore(OBJECTIVE_SCORE);
			}
			break;
		case RIGHT:
			if (board.getCell(pos_X + 1, pos_Y) == Cell.CellType.ITEM) {
				board.addBody(direction);
				NewObjective();
				score.addScore(OBJECTIVE_SCORE);
			}
			break;
		}
	}
	
	/**
	 * create a new Objective
	 * 
	 */
	public void NewObjective() {
		int pos_x = (int)(Math.random() * rowSize);
		int pos_y = (int)(Math.random() * colSize);
		if (board.getCell(pos_x, pos_y) != Cell.CellType.SNAKE) {
			board.setCells(pos_x, pos_y, Cell.CellType.ITEM);
		} else {
			NewObjective();
		}
	}
	
	public void GameOver() {
		String userName;
		long Time = finishTime - startTime;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		userName = sc.nextLine();
		score.setUserName(userName);
		score.setDuration(Time);
	}
}