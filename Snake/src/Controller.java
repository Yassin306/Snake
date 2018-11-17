import com.sun.glass.events.KeyEvent;

/**
 * 
 */

/**
 * @author 
 *
 */
public class Controller extends KeyAdapter {
	public enum Direction{
		UP,DOWN,LEFT,RIGHT
	}
	private Direction direction;
	
	/**
	 * 
	 */
	
	
	public Controller() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the direction
	 */
	public Direction getDirection() {
		return direction;
	}
	
	@Override
	public void KeyPressed(KeyEvent key_press) {
		
		int key = key_press.getKeyCode();
		
		if (key == KeyEvent.VK_UP) {
			direction = Direction.UP;
		}
		
		if (key == KeyEvent.VK_DOWN) {
			direction = Direction.DOWN;
		}
		
		if (key == KeyEvent.VK_LEFT) {
			direction = Direction.LEFT;
		}
		
		if (key == KeyEvent.VK_RIGHT) {
			direction = Direction.RIGHT;
		}
		
	}

}
