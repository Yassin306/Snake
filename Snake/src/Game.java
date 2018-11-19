import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/**
 * 
 */

/**
 * @author 
 *
 */
public class Game extends JFrame implements KeyListener {
	private Board board;
	private int rowSize;
	private int colSize;
	private Score score = new Score();
	private static final int OBJECTIVE_SCORE= 10;
	private long startTime;
	private long finishTime;
	private JButton bAceptar;
	
	public Game(int rowSize, int colSize) {
		this.rowSize = rowSize;
		this.colSize = colSize;
		add(getbAceptar());
		start();		
	}
	
	/**
	 * Game start
	 * @throws InterruptedException 
	 */
	public void start() {
		board = new Board(rowSize, colSize);
		board.setHead((int) (rowSize/2), (int) (colSize/2));
		NewObjective();
		startTime = System.currentTimeMillis();
		
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		add(board, BorderLayout.CENTER);
		
		setSize(board.getColSize() * 22, board.getRowSize() * 22);
		
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		
		play(board.getDirection());
	}
	
	public void play(Board.Direction direction) {
		boolean obj = false;
		Cell.CellType cell = null;
		do {
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
							
			board.repaint();
			
			
										
			
			cell = board.move();
			obj = board.isItem(cell);
			if (obj) {
				NewObjective();
			}
			board.update_snake(obj);
			
		} while(cell != Cell.CellType.WALL && cell != Cell.CellType.SNAKE);
		GameOver();
		
	}
	
	/**
	 * @return if the snake has collided or not
	 */
	public boolean CheckCollision(Board.Direction direction) {
		int pos_X = board.getHead().getX();
		int pos_Y = board.getHead().getY();
		boolean collision = false;
		switch (direction) {
		case UP:
			if (board.getCell(pos_X, pos_Y - 1) != Cell.CellType.WALL) {
				collision = true;
			}
			break;
		case DOWN:
			if (board.getCell(pos_X, pos_Y + 1) != Cell.CellType.WALL) {
				collision = true;
			}
			break;
		case LEFT:
			if (board.getCell(pos_X - 1, pos_Y) != Cell.CellType.WALL) {
				collision = true;
			}
			break;
		case RIGHT:
			if (board.getCell(pos_X + 1, pos_Y) != Cell.CellType.WALL) {
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
	public boolean CheckObjective(Board.Direction direction) {
		return false;
	}
	
	/**
	 * create a new Objective
	 * 
	 */
	public void NewObjective() {
		int pos_x = (int)(Math.random() * rowSize);
		int pos_y = (int)(Math.random() * colSize);
		if (board.getCell(pos_x, pos_y) != Cell.CellType.SNAKE
				&& board.getCell(pos_x, pos_y) != Cell.CellType.WALL) {
			board.setCells(pos_x, pos_y, randomItem());
		} else {
			NewObjective();
		}
	}
	
	/**
	 * create a new Objective
	 * @return 
	 * 
	 */
	public Cell.CellType randomItem() {
		int Random = (int)(Math.random()*4);
		if (Random == 0) {
			return Cell.CellType.BIG_ITEM;
		} else if (Random == 1) {
			return Cell.CellType.MED_ITEM;
		} else {
			return Cell.CellType.SMALL_ITEM;
		}
	}
	
	/**
	 * GameOver Screen
	 * 
	 */
	public void GameOver() {
		String userName;
		long Time = finishTime - startTime;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		userName = sc.nextLine();
		score.setUserName(userName);
		score.setDuration(Time);
	}
	
	/**
	 * @return the pressed button
	 */
	private JButton getbAceptar() {
		 bAceptar = new JButton();
		 bAceptar.addKeyListener(this);
		 return bAceptar;
	}
	
	/**
	 * Override the keyPressed function from KeyListener class
	 * set the direction depending on the pressed key.
	 */
	@Override
	public void keyPressed(KeyEvent key_press) {
		
		int key = key_press.getKeyCode();
		Board.Direction direction;
		
		if ((key == KeyEvent.VK_UP) && (board.getDirection() != Board.Direction.DOWN)) {
			

			direction = Board.Direction.UP;
			board.setDirection(direction);

		}
		
		if ((key == KeyEvent.VK_DOWN) && (board.getDirection()!= Board.Direction.UP)) {
			

			direction = Board.Direction.DOWN;
			board.setDirection(direction);

		}
		
		if ((key == KeyEvent.VK_LEFT) && (board.getDirection() != Board.Direction.RIGHT)) {
			

			direction = Board.Direction.LEFT;
			board.setDirection(direction);

		}
		
		if ((key == KeyEvent.VK_RIGHT) && (board.getDirection() != Board.Direction.LEFT)) {
			

			direction = Board.Direction.RIGHT;
			board.setDirection(direction);

		}
		
		
	}
	/**
	 * default keyReleased function from KeyListener class
	 */
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * default keyTyped function from KeyListener class
	 */
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public int getScore() {
		return score.getUserScore();
	}
	
	public long getDuration() {
		return score.getDuration();
	}
	
	public String getName() {
		return score.getUserName();
	}
}